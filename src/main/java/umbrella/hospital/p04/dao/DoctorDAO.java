package umbrella.hospital.p04.dao;

import umbrella.hospital.p04.model.Doctor;
import umbrella.hospital.p04.model.Patient;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class DoctorDAO extends ObjectDAO {
    private static final String filePath = System.getProperty("user.dir") + "/src/main/java/umbrella/hospital/p04/data/doctors.ser";
    private static DoctorDAO instance;

    public DoctorDAO() {
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

    @Override
    public ArrayList Read() {
        return readDoctors();
    }

    public static DoctorDAO getInstance() {
        if (instance == null) {
            instance = new DoctorDAO();
        }
        return instance;
    }

    public static ArrayList readDoctors() {
        ArrayList<Doctor> doctors = new ArrayList<>();
        ObjectInputStream ois = null;
        try {
            ByteArrayInputStream bis = new ByteArrayInputStream(Files.readAllBytes(Paths.get(filePath)));
            ois = new ObjectInputStream(bis);

            doctors = (ArrayList<Doctor>) ois.readObject();

            ois.close();
            bis.close();
        } catch (EOFException eofException) {
            return doctors;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return doctors;
    }

    public static void saveDoctors(ArrayList<Doctor> doctors) {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = null;
            oos = new ObjectOutputStream(bos);

            oos.writeObject(doctors);
            Files.write(Paths.get(filePath), bos.toByteArray());

            oos.close();
            bos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
