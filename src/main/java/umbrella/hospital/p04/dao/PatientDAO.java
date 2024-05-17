package umbrella.hospital.p04.dao;

import umbrella.hospital.p04.model.Patient;

import java.util.*;
import java.io.*;

public class PatientDAO extends ObjectDAO{
    private static final String filePath = System.getProperty("user.dir") + "/src/main/java/umbrella/hospital/p04/data/patients.csv";
    private static PatientDAO instance;

    public PatientDAO() {
        super(filePath);
        File file = new File(filePath);
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
        String line;
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filePath));
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 6) {
                    int counter = 0;
                    String name = parts[counter++];
                    String email = parts[counter++];
                    String password = parts[counter++];
                    String address = parts[counter++];
                    String dateOfBirth = parts[counter];
                    patients.add(new Patient(name, email, address, password, dateOfBirth));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return patients;
    }
}
