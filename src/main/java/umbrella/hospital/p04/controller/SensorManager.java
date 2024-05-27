package umbrella.hospital.p04.controller;

import umbrella.hospital.p04.dao.SensorDAO;
import umbrella.hospital.p04.model.Patient;
import umbrella.hospital.p04.model.PredefinedSensors;

import java.util.ArrayList;

public class SensorManager {
    private static ArrayList<PredefinedSensors> sensorsList = SensorDAO.getInstance().Read();

    public SensorManager() {
        restoreSensorsList();
    }

    public static boolean addSensor(PredefinedSensors sensor, Patient patient) {
        if (findPatientSensorData(patient) == null) {
            sensorsList.add(sensor);
            saveSensorsList();
            return true;
        }
        return false;
    }

    public static ArrayList<PredefinedSensors> getSensorsList() {
        return sensorsList;
    }

    public static void saveSensorsList() {
        SensorDAO.saveSensors(sensorsList);
    }

    public static void restoreSensorsList() {
        sensorsList = SensorDAO.getInstance().Read();
    }

    public static void deleteSensor(PredefinedSensors sensor) {
        sensorsList.remove(sensor);
        saveSensorsList();
    }

    public static void updateSensorDataByPatient(PredefinedSensors sensor, Patient patient) {
        PredefinedSensors sor = findPatientSensorData(patient);
        if (sor != null) {
            sensorsList.remove(sor);
            sensorsList.add(sensor);
            saveSensorsList();
        }
    }

    private static PredefinedSensors findPatientSensorData(Patient patient) {
        for (PredefinedSensors sensor : sensorsList) {
            if (sensor.getPatient().getEmail().equals(patient.getEmail())) {
                return sensor;
            }
        }
        return null;
    }
}
