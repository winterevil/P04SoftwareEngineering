package umbrella.hospital.p04.controller;

import umbrella.hospital.p04.dao.DoctorDAO;
import umbrella.hospital.p04.dao.PatientDAO;
import umbrella.hospital.p04.model.Doctor;
import umbrella.hospital.p04.model.Patient;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Objects;

public class UserManager {

    private static ArrayList<Patient> patientList = PatientDAO.getInstance().Read();
    private static ArrayList<Doctor> doctorList = DoctorDAO.getInstance().Read();

    public UserManager() {
        restorePatientList();
        restoreDoctorList();
    }

    public static void addPatient(Patient patient) {
        if (findPatientByEmail(patient.getEmail()) == null) {
            patientList.add(patient);
            savePatientList();
        }
    }

    public static void addDoctor(Doctor doctor) {
        if (findDoctorByEmail(doctor.getEmail()) == null) {
            doctorList.add(doctor);
            saveDoctorList();
        }
    }

    public static Doctor findDoctorByEmail(String email) {
        for (Doctor doctor : doctorList) {
            if (doctor.getEmail().equals(email)) {
                return doctor;
            }
        }
        return null;
    }

    public static Patient findPatientByEmail(String email) {
        for (Patient patient : patientList) {
            if (patient.getEmail().equals(email)) {
                return patient;
            }
        }
        return null;
    }

    public static boolean deleteAccount(String email) {
        Patient temp = findPatientByEmail(email);
        if (temp != null) {
            patientList.remove(temp);
            savePatientList();
            return true;
        }
        return false;
    }

    public static void updatePatient(Patient patient) {
        for (Patient pat : patientList) {
            if (Objects.equals(pat.getEmail(), patient.getEmail())) {
                pat.setName(patient.getName());
                pat.setEmail(patient.getEmail());
                pat.setAddress(patient.getAddress());
                pat.setPassword(patient.getPassword());
                pat.setDayOfBirth(patient.getDayOfBirth());
            }
        }
        savePatientList();
    }

    public static void updateDoctor(Doctor doctor) {
        for (Doctor doc : doctorList) {
            if (Objects.equals(doc.getEmail(), doctor.getEmail())) {
                doc.setName(doctor.getName());
                doc.setEmail(doctor.getEmail());
                doc.setAddress(doctor.getAddress());
                doc.setPassword(doctor.getPassword());
            }
        }
        saveDoctorList();
    }

    public static String login(String email, String password) {
        Patient patient = loginPatient(email, password);
        if (patient != null) {
            if (assignedDoctor(patient)) {
                return "Patient";
            } else {
                return "No Doctor";
            }
        }
        Doctor doctor = loginDoctor(email, password);
        if (doctor != null) {
            if(getPatient(doctor)){
                return "Doctor";
            } else{
                return "No Patient";
            }
        }
        return null;
    }

    public static Patient loginPatient(String email, String password) {
        String hashedPassword = hashPasswordWithMD5(password);
        //restorePatientList();
        for (Patient patient : patientList) {
            if (patient.getEmail().equals(email) && patient.getPassword().equals(hashedPassword)) {
                return patient;
            }
        }
        return null;
    }

    public static Doctor loginDoctor(String email, String password) {
        String hashedPassword = hashPasswordWithMD5(password);
        //restoreDoctorList();
        for (Doctor doctor : doctorList) {
            if (doctor.getEmail().equals(email) && doctor.getPassword().equals(hashedPassword)) {
                return doctor;
            }
        }
        return null;
    }

    public static boolean SignUpPatient(String name, String email, String address, String password, String dayOfBirth) {
        if (findPatientByEmail(email) != null || findDoctorByEmail(email) != null) {
            return false;
        }
        Patient patient = new Patient(name, email, address, hashPasswordWithMD5(password), dayOfBirth);
        addPatient(patient);
        return true;
    }

    public static boolean SignUpDoctor(String name, String email, String address, String password) {
        if (findDoctorByEmail(email) != null || findPatientByEmail(email) != null) {
            return false;
        }
        Doctor doctor = new Doctor(name, email, address, hashPasswordWithMD5(password));
        addDoctor(doctor);
        return true;
    }

    public static int count() {
        return patientList.size();
    }

    public static void changePassword(String email, String newPassword) {
        Patient patient = findPatientByEmail(email);
        if (patient != null) {
            patient.setPassword(hashPasswordWithMD5(newPassword));
            updatePatient(patient);
        }
        Doctor doctor = findDoctorByEmail(email);
        if (doctor != null) {
            doctor.setPassword(hashPasswordWithMD5(newPassword));
            updateDoctor(doctor);
        }
    }

    public static String hashPasswordWithMD5(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes());
            byte[] digest = md.digest();
            return DatatypeConverter.printHexBinary(digest).toUpperCase();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void savePatientList() {
        PatientDAO.savePatients(patientList);
    }

    public static void saveDoctorList() {
        DoctorDAO.saveDoctors(doctorList);
    }

    public static void restoreDoctorList() {
        doctorList = DoctorDAO.getInstance().Read();
    }

    public static void restorePatientList() {
        patientList = PatientDAO.getInstance().Read();
    }

    public static ArrayList getPatientList() {
        return patientList;
    }

    public static void setPatientList(ArrayList patientList) {
        UserManager.patientList = patientList;
    }

    public static ArrayList getDoctorList() {
        return doctorList;
    }

    public static void setDoctorList(ArrayList doctorList) {
        UserManager.doctorList = doctorList;
    }

    public static boolean assignedDoctor(Patient patient) {
        if (doctorList.isEmpty()) {
            return false;
        }

        if (patient.getAssignedDoctor() != null) {
            return true;
        }

        for (Doctor doctor : doctorList) {
            if (doctor.getAssignedPatient() == null) {
                doctor.setAssignedPatient(patient);
                patient.setAssignedDoctor(doctor);
                saveDoctorList();
                savePatientList();
                return true;
            }
        }

        return false;
    }

    public static void deleteAssignedDoctor(Patient patient) {
        if (patient.getAssignedDoctor() != null) {
            patient.setAssignedDoctor(null);
            saveDoctorList();
            savePatientList();
        }
    }

    public static void deleteAssignedPatient(Doctor doctor) {
        if (doctor.getAssignedPatient() != null) {
            doctor.setAssignedPatient(null);
            saveDoctorList();
            savePatientList();
        }
    }

    private static boolean getPatient(Doctor doctor) {
        if (patientList.isEmpty()) {
            return false;
        }
        if (doctor.getAssignedPatient() != null) {
            return true;
        }

        for (Patient patient : patientList) {
            if (patient.getAssignedDoctor() == null) {
                doctor.setAssignedPatient(patient);
                patient.setAssignedDoctor(doctor);
                saveDoctorList();
                savePatientList();
                return true;
            }
        }

        return false;
    }
}
