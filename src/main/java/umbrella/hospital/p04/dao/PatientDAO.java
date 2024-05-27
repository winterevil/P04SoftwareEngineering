package umbrella.hospital.p04.dao;

import umbrella.hospital.p04.model.Patient;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.io.*;

public class PatientDAO extends ObjectDAO {

    private static final String filePath = System.getProperty("user.dir") + "/src/main/java/umbrella/hospital/p04/data/patients.ser";
    private static PatientDAO instance;

    public PatientDAO() {
        super(filePath);
        File file = new File(filePath);
        File parentDir = file.getParentFile();

        if (!parentDir.exists()) {
            parentDir.mkdirs();
        }

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static PatientDAO getInstance() {
        if (instance == null) {
            instance = new PatientDAO();
        }
        return instance;
    }

    @Override
    public ArrayList Read() {
        return readPatients();
    }

    public static ArrayList<Patient> readPatients() {
        ArrayList<Patient> patients = new ArrayList<>();
        ObjectInputStream ois = null;
        try {
            ByteArrayInputStream bis = new ByteArrayInputStream(Files.readAllBytes(Paths.get(filePath)));
            ois = new ObjectInputStream(bis);

            patients = (ArrayList<Patient>) ois.readObject();

            ois.close();
            bis.close();
        } catch(EOFException eofException){
            return patients;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return patients;
    }

    public static void savePatients(ArrayList<Patient> patients) {
        ObjectOutputStream oos = null;
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);

            oos.writeObject(patients);
            Files.write(Paths.get(filePath), bos.toByteArray());

            oos.close();
            bos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
