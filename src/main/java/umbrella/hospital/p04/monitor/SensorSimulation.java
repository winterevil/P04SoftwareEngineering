package umbrella.hospital.p04.monitor;

import umbrella.hospital.p04.model.PredefinedSensors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class SensorSimulation {
    private static final List<PredefinedSensors> healthDataList = new ArrayList<>();
    private static final HealthAnalysis healthAnalysis = new HealthAnalysis();
    private static final SensorData sensorData = new SensorData();
    private static final List<Float> temperatureList = new ArrayList<>();
    private static final List<float[]> bloodPressureList = new ArrayList<float[]>();
    private static final List<Integer> heartRateList = new ArrayList<>();

    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        Runnable updateDataTask = new Runnable() {
            @Override
            public void run() {
                try {
                    float temperature = sensorData.getTemperature();
                    temperatureList.add(temperature);

                    float[] bloodPressure = sensorData.getBloodPressure();
                    bloodPressureList.add(bloodPressure);

                    int heartRate = sensorData.getHeartRate();
                    heartRateList.add(heartRate);
                    PredefinedSensors newData = new PredefinedSensors(temperature, bloodPressure, heartRate);
                    healthDataList.add(newData);
                    if (temperatureList.size() % 5 == 0) {
                        float averageTemperature = calculateAverage(temperatureList);
                        float[] averageBloodPressure = new float[]{calculateAverage(bloodPressureList.stream().map(bp -> bp[0]).collect(Collectors.toList())), calculateAverage(bloodPressureList.stream().map(bp -> bp[1]).collect(Collectors.toList()))};
                        float averageHeartRate = calculateAverageInt(heartRateList);

                        System.out.println("Average Sensor Data: Temperature = " + averageTemperature + ", Blood Pressure = " + Arrays.toString(averageBloodPressure) + ", Heart Rate = " + averageHeartRate);

                        String generalHealthStatus = healthAnalysis.judgeHealthStatus(averageTemperature, averageBloodPressure, (int) averageHeartRate);
                        System.out.println("General Health Status: " + generalHealthStatus);

                        String healthIssues = healthAnalysis.diagnoseHealthIssue(averageTemperature, averageBloodPressure, (int) averageHeartRate);
                        System.out.println("Health Issues: " + healthIssues);

                        String healthRecommendations = healthAnalysis.getAdvice(healthIssues);
                        System.out.println("Health Recommendations: " + healthRecommendations);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };

        // Schedule the task to run at custom intervals (e.g., every 15 seconds)
        int intervalSeconds = 5;
        scheduler.scheduleAtFixedRate(updateDataTask, 0, intervalSeconds, TimeUnit.SECONDS);
    }

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
}
