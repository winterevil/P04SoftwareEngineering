package umbrella.hospital.p04.model;

import umbrella.hospital.p04.monitor.SensorMachineSimulation;

import java.io.Serializable;

public class Doctor implements Serializable {
    private String name;
    private String email;
    private String address;
    private String password;
    private String code;
    private Patient assignedPatient;
    //private String assignedPatientEmail;
    private transient SensorMachineSimulation sensorMachineSimulation;

    public Doctor() {
    }

    public Doctor(String name, String email, String address, String password) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.password = password;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Patient getAssignedPatient() {
        return assignedPatient;
    }

    public void setAssignedPatient(Patient assignedPatient) {
        this.assignedPatient = assignedPatient;
    }

//    public String getAssignedPatientEmail() {
//        return assignedPatientEmail;
//    }
//
//    public void setAssignedPatientEmail(String assignedPatientEmail) {
//        this.assignedPatientEmail = assignedPatientEmail;
//    }

    public SensorMachineSimulation getSensorMachineSimulation() {
        return sensorMachineSimulation;
    }

    public void setSensorMachineSimulation(SensorMachineSimulation sensorMachineSimulation) {
        this.sensorMachineSimulation = sensorMachineSimulation;
    }

//    @Override
//    public String toString() {
//        assignedPatientEmail = assignedPatient != null ? assignedPatient.getEmail() : null;
//        return name + "," + email + "," + address + "," + password + "," + assignedPatientEmail + "\n";
//    }
    
    @Override
    public String toString() {
       
        return name + "," + email + "," + address + "," + password + ","  + "\n";
    }
}
