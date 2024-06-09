package umbrella.hospital.p04.model;

import umbrella.hospital.p04.monitor.SensorMachineSimulation;

import java.io.Serializable;

public class Patient implements Serializable {
    private String name;
    private String email;
    private String address;
    private String password;
    private String dayOfBirth;
    private String code;
    private Doctor assignedDoctor;
    //private String assignedDoctorEmail;
    private transient SensorMachineSimulation sensorMachineSimulation;
    private float fee;

    public Patient() {
    }

    public Patient(String name, String email, String address, String password, String dayOfBirth) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.password = password;
        this.dayOfBirth = dayOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Doctor getAssignedDoctor() {
        return assignedDoctor;
    }

    public void setAssignedDoctor(Doctor assignedDoctor) {
        this.assignedDoctor = assignedDoctor;
    }

//    public String getAssignedDoctorEmail() {
//        return assignedDoctorEmail;
//    }

//    public void setAssignedDoctorEmail(String assignedDoctorEmail) {
//        this.assignedDoctorEmail = assignedDoctorEmail;
//    }

    public SensorMachineSimulation getSensorMachineSimulation() {
        return sensorMachineSimulation;
    }

    public void setSensorMachineSimulation(SensorMachineSimulation sensorMachineSimulation) {
        this.sensorMachineSimulation = sensorMachineSimulation;
    }

    public float getFee() {
        return fee;
    }

    public void setFee(float fee) {
        this.fee = fee;
    }

//    @Override
//    public String toString() {
//        assignedDoctorEmail = assignedDoctor != null ? assignedDoctor.getEmail() : null;
//        return name + "," + email + "," + address + "," + password + "," + dayOfBirth + "," + assignedDoctorEmail + "\n";
//    }
    
    @Override
    public String toString() {
        return name + "," + email + "," + address + "," + password + "," + dayOfBirth + "," + "\n";
    }
}
