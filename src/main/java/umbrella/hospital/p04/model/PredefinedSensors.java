public class PredefinedSensors {

    private float temperature;
    private float systolicPressure;
    private float diastolicPressure;
    private int heartRate;

    public PredefinedSensors(float temperature, float systolicPressure, float diastolicPressure, int heartRate) {
        this.temperature = temperature;
        this.systolicPressure = systolicPressure;
        this.diastolicPressure = diastolicPressure;
        this.heartRate = heartRate;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getSystolicPressure() {
        return systolicPressure;
    }

    public float getDiastolicPressure() {
        return diastolicPressure;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setTemperature(float newTemperature) throws InvalidSensorDataException {
        if (newTemperature < 30 || newTemperature > 42) {
            throw new InvalidSensorDataException("Temperature out of range (30-42 degrees Celsius)");
        }
        this.temperature = newTemperature;
    }

    public void setSystolicPressure(float systolicPressure) throws InvalidSensorDataException {
        if (systolicPressure < 80 || systolicPressure > 200) {
            throw new InvalidSensorDataException("Systolic pressure out of range (80-200 mmHg)");
        }
        this.systolicPressure = systolicPressure;
    }

    public void setDiastolicPressure(float diastolicPressure) throws InvalidSensorDataException {
        if (diastolicPressure < 40 || diastolicPressure > 120) {
            throw new InvalidSensorDataException("Diastolic pressure out of range (40-120 mmHg)");
        }
        this.diastolicPressure = diastolicPressure;
    }

    public void setHeartRate(int newHeartRate) throws InvalidSensorDataException {
        if (newHeartRate < 40 || newHeartRate > 200) {
            throw new InvalidSensorDataException("Heart rate out of range (40-200 bpm)");
        }
        this.heartRate = newHeartRate;
    }

    // Calibration method (implementation depends on specific sensor hardware/software)
    public void calibrate() {
        // Simulate calibration process (replace with actual calibration logic)
        System.out.println("Calibration initiated...");
        // ... (perform calibration steps)
        System.out.println("Calibration complete.");
    }
}

class InvalidSensorDataException extends Exception {
    public InvalidSensorDataException(String message) {
        super(message);
    }
}

