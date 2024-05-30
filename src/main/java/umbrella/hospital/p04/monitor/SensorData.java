package umbrella.hospital.p04.monitor;

import java.util.Random;

public class SensorData {
    private final TemperatureSensor temperatureSensor;
    private final BloodPressureSensor bloodPressureSensor;
    private final HeartRateSensor heartRateSensor;
    private final HealthState state;

    public enum HealthState {
        NORMAL,
        ABNORMAL,
        CRITICAL
    }

    public SensorData() {
        this.temperatureSensor = new TemperatureSensor();
        this.bloodPressureSensor = new BloodPressureSensor();
        this.heartRateSensor = new HeartRateSensor();
        this.state = pickRandomState();
    }

    private HealthState pickRandomState() {
        Random random = new Random();
        int pick = random.nextInt(3);
        return HealthState.values()[pick];
    }

    public float getTemperature() {
        return temperatureSensor.getTemperature(state);
    }

    public float[] getBloodPressure() {
        return bloodPressureSensor.getBloodPressure(state);
    }

    public int getHeartRate() {
        return heartRateSensor.getHeartRate(state);
    }

    public HealthState getHealthState() {
        return state;
    }
}

class TemperatureSensor {
    private final Random random = new Random();

    public float getTemperature(SensorData.HealthState state) {
        return switch (state) {
            case NORMAL -> 36.0f + random.nextFloat() * 1.5f; // 36.0 to 37.5
            case ABNORMAL ->
                    random.nextBoolean() ? 35.0f + random.nextFloat() : 37.5f + random.nextFloat() * 1.5f; // 35.0 to 36.0 or 37.5 to 39.0
            case CRITICAL ->
                    random.nextBoolean() ? 34.0f + random.nextFloat() : 39.0f + random.nextFloat() * 2.0f; // 34.0 to 35.0 or 39.0 to 41.0
            default -> throw new IllegalStateException("Unexpected value: " + state);
        };
    }
}

class BloodPressureSensor {
    private final Random random = new Random();

    public float[] getBloodPressure(SensorData.HealthState state) {
        return switch (state) {
            case NORMAL ->
                    new float[]{90 + random.nextFloat() * 30, 60 + random.nextFloat() * 20}; // 90-120 systolic, 60-80 diastolic
            case ABNORMAL -> new float[]{
                    random.nextBoolean() ? 80 + random.nextFloat() * 10 : 120 + random.nextFloat() * 30,
                    random.nextBoolean() ? 50 + random.nextFloat() * 10 : 80 + random.nextFloat() * 20
            }; // Either below or above normal ranges
            case CRITICAL -> new float[]{
                    random.nextBoolean() ? 70 + random.nextFloat() * 10 : 150 + random.nextFloat() * 50,
                    random.nextBoolean() ? 40 + random.nextFloat() * 10 : 100 + random.nextFloat() * 20
            }; // Much below or above normal ranges
            default -> throw new IllegalStateException("Unexpected value: " + state);
        };
    }
}

class HeartRateSensor {
    private final Random random = new Random();

    public int getHeartRate(SensorData.HealthState state) {
        return switch (state) {
            case NORMAL -> 60 + random.nextInt(41); // 60-100 bpm
            case ABNORMAL ->
                    random.nextBoolean() ? 50 + random.nextInt(10) : 100 + random.nextInt(31); // 50-60 or 100-130 bpm
            case CRITICAL ->
                    random.nextBoolean() ? 40 + random.nextInt(10) : 130 + random.nextInt(21); // 40-50 or 130-150 bpm
            default -> throw new IllegalStateException("Unexpected value: " + state);
        };
    }
}