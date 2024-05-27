package umbrella.hospital.p04.monitor;

import umbrella.hospital.p04.model.PredefinedSensors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SensorMachineSimulation {
    private static final List<PredefinedSensors> healthDataList = new ArrayList<>();
    private static final HealthAnalysis healthAnalysis = new HealthAnalysis();
    private static final SensorData sensorData = new SensorData();
    private static final List<Float> temperatureList = new ArrayList<>();
    private static final List<float[]> bloodPressureList = new ArrayList<float[]>();
    private static final List<Integer> heartRateList = new ArrayList<>();
    private float averageTemperature;
    private float[] averageBloodPressure;
    private float averageHeartRate;
    private String generalHealthStatus;
    private String healthIssues;
    private String healthRecommendations;
    private float temperature;
    private float[] bloodPressure;
    private int heartRate;

    private static float calculateAverage(List<Float> list) {
        float sum = 0;
        for (float num : list) {
            sum += num;
        }
        return sum / list.size();
    }

    private static float calculateAverageInt(List<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return (float) sum / list.size();
    }

    public void run() {
        try {
            temperature = sensorData.getTemperature();
            temperatureList.add(temperature);

            bloodPressure = sensorData.getBloodPressure();
            bloodPressureList.add(bloodPressure);

            heartRate = sensorData.getHeartRate();
            heartRateList.add(heartRate);
            PredefinedSensors newData = new PredefinedSensors(temperature, bloodPressure, heartRate);
            healthDataList.add(newData);
            if (temperatureList.size() % 5 == 0) {
                averageTemperature = calculateAverage(temperatureList);
                averageBloodPressure = new float[]{calculateAverage(bloodPressureList.stream().map(bp -> bp[0]).collect(Collectors.toList())), calculateAverage(bloodPressureList.stream().map(bp -> bp[1]).collect(Collectors.toList()))};
                averageHeartRate = calculateAverageInt(heartRateList);

                generalHealthStatus = healthAnalysis.judgeHealthStatus(averageTemperature, averageBloodPressure, (int) averageHeartRate);
                healthIssues = healthAnalysis.diagnoseHealthIssue(averageTemperature, averageBloodPressure, (int) averageHeartRate);
                healthRecommendations = healthAnalysis.getAdvice(healthIssues);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public float getAverageTemperature() {
        return averageTemperature;
    }

    public float[] getAverageBloodPressure() {
        return averageBloodPressure;
    }

    public int getAverageHeartRate() {
        return (int) averageHeartRate;
    }

    public String getGeneralHealthStatus() {
        return generalHealthStatus;
    }

    public String getHealthIssues() {
        return healthIssues;
    }

    public String getHealthRecommendations() {
        return healthRecommendations;
    }

    public int getTemperature() {
        return (int) temperature;
    }

    public float[] getBloodPressure() {
        return bloodPressure;
    }

    public String getBloodPressureString() {
        return (int) bloodPressure[0] + "/" + (int) bloodPressure[1];
    }

    public int getHeartRate() {
        return heartRate;
    }

}
