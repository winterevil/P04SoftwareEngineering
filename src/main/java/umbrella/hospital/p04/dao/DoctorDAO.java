package umbrella.hospital.p04.dao;

import umbrella.hospital.p04.model.Doctor;

import java.io.*;
import java.util.*;

public class DoctorDAO extends ObjectDAO{
    private static final String filePath = System.getProperty("user.dir") + "/src/main/java/umbrella/hospital/p04/data/doctors.csv";
    private static DoctorDAO instance;

    public DoctorDAO() {
        super(filePath);
        File file = new File(filePath);
        if(!file.exists()){
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
        String line;
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filePath));
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 6) {
                    int count = 0;
                    String name = parts[count++];
                    String email = parts[count++];
                    String password = parts[count++];
                    String address = parts[count];
                    doctors.add(new Doctor(name, email, address, password));
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
        return doctors;
    }
}
