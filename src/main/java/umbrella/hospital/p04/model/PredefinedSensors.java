package umbrella.hospital.p04.model;

import java.io.Serializable;
import java.util.Arrays;

public class PredefinedSensors implements Serializable {

    private float temperature;
    private float systolicPressure;
    private float diastolicPressure;
    private float[] bloodPressure;
    private int heartRate;
    private Patient patient;

    public PredefinedSensors(float temperature, float systolicPressure, float diastolicPressure, int heartRate, Patient patient) {
        this.temperature = temperature;
        this.systolicPressure = systolicPressure;
        this.diastolicPressure = diastolicPressure;
        bloodPressure = new float[]{systolicPressure, diastolicPressure};
        this.heartRate = heartRate;
        this.patient = patient;
    }

    public PredefinedSensors(float temperature, float[] bloodPressure, int heartRate) {
        this.temperature = temperature;
        this.bloodPressure = bloodPressure;
        this.heartRate = heartRate;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getSystolicPressure() {
        return systolicPressure;
    }

    public void setSystolicPressure(float systolicPressure) {
        this.systolicPressure = systolicPressure;
    }

    public float getDiastolicPressure() {
        return diastolicPressure;
    }

    public void setDiastolicPressure(float diastolicPressure) {
        this.diastolicPressure = diastolicPressure;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public float[] getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(float[] bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    @Override
    public String toString() {
        return temperature + "," + Arrays.toString(bloodPressure) + "," + heartRate + "," + "\n";
    }
}
