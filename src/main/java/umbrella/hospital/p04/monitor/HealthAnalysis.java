package umbrella.hospital.p04.monitor;

public class HealthAnalysis {
    public String judgeHealthStatus(double temperature, float[] bloodPressure, int heartRate) {
        if (isTemperatureNormal(temperature) && isBloodPressureNormal(bloodPressure) && isHeartRateNormal(heartRate)) {
            return "Normal";
        } else if (isCritical(temperature, bloodPressure, heartRate)) {
            return "Critical";
        } else {
            return "Abnormal";
        }
    }

    public String diagnoseHealthIssue(double temperature, float[] bloodPressure, int heartRate) {
        StringBuilder issues = new StringBuilder();

        if (!isTemperatureNormal(temperature)) {
            if (temperature > 37.5) {
                issues.append("Fever: Your temperature is ").append(temperature).append(" °C, which is above the normal range. ");
                issues.append("A fever can be caused by various infections or other health conditions. Ensure you stay hydrated and rest. If the fever exceeds 39°C or persists for several days, seek medical advice. ");
            } else if (temperature < 36.0) {
                issues.append("Hypothermia: Your temperature is ").append(temperature).append(" °C, which is below the normal range. ");
                issues.append("Hypothermia can be dangerous, often caused by prolonged exposure to cold. Warm yourself gradually, avoiding direct heat sources. Seek medical attention if you experience severe symptoms. ");
            }
        }

        if (!isBloodPressureNormal(bloodPressure)) {
            if (bloodPressure[0] > 120 || bloodPressure[1] > 80) {
                issues.append("Hypertension: Your blood pressure is ").append(bloodPressure[0]).append("/").append(bloodPressure[1]).append(" mmHg, which is higher than normal. ");
                issues.append("Hypertension, or high blood pressure, increases the risk of heart disease and stroke. It can be managed through lifestyle changes and medication. Regular monitoring and consulting a doctor is recommended. ");
            } else if (bloodPressure[0] < 90 || bloodPressure[1] < 60) {
                issues.append("Hypotension: Your blood pressure is ").append(bloodPressure[0]).append("/").append(bloodPressure[1]).append(" mmHg, which is lower than normal. ");
                issues.append("Hypotension, or low blood pressure, can cause dizziness and fainting. Ensure adequate hydration and consider increasing salt intake after consulting a healthcare provider. ");
            }
        }

        if (!isHeartRateNormal(heartRate)) {
            if (heartRate > 100) {
                issues.append("Tachycardia: Your heart rate is ").append(heartRate).append(" bpm, which is faster than normal. ");
                issues.append("Tachycardia can be caused by stress, anxiety, or underlying health conditions. Avoid stimulants like caffeine and seek medical advice if the condition persists. ");
            } else if (heartRate < 60) {
                issues.append("Bradycardia: Your heart rate is ").append(heartRate).append(" bpm, which is slower than normal. ");
                issues.append("Bradycardia may be normal for athletes but could indicate an issue if accompanied by fatigue or dizziness. Consult a healthcare provider to rule out serious conditions. ");
            }
        }

        if (issues.isEmpty()) {
            return "No specific health issues detected.";
        }
        return issues.toString();
    }

    public String getAdvice(String healthIssue) {
        if (healthIssue.contains("Fever")) {
            return "Fever: Ensure you stay hydrated and rest. If your fever exceeds 39°C or persists for several days, seek medical advice to rule out serious infections or conditions. Over-the-counter medications like acetaminophen can help reduce fever.";
        }
        if (healthIssue.contains("Hypothermia")) {
            return "Hypothermia: Gradually warm yourself using blankets and warm drinks, avoiding direct heat sources like hot water or fires. If symptoms are severe, such as shivering, confusion, or slurred speech, seek medical attention immediately.";
        }
        if (healthIssue.contains("Hypertension")) {
            return "Hypertension: Monitor your blood pressure regularly. Reduce salt intake, maintain a healthy diet, exercise regularly, and manage stress. Consult a doctor for potential medications and more personalized advice.";
        }
        if (healthIssue.contains("Hypotension")) {
            return "Hypotension: Ensure you are drinking enough fluids, especially in hot weather. Eating small, frequent meals and increasing salt intake can help, but consult a doctor before making significant changes. Avoid standing up quickly to prevent dizziness.";
        }
        if (healthIssue.contains("Tachycardia")) {
            return "Tachycardia: Avoid stimulants like caffeine and nicotine. Practice relaxation techniques such as deep breathing or meditation. Ensure you are not overexerting yourself during physical activities. If the high heart rate persists, seek medical advice.";
        }
        if (healthIssue.contains("Bradycardia")) {
            return "Bradycardia: If you experience symptoms like dizziness, fatigue, or fainting, seek medical advice. Certain medications or conditions may need to be evaluated by a healthcare provider. Ensure you maintain regular check-ups.";
        }
        return "Please consult a healthcare professional for more personalized advice based on your specific condition.";
    }

    private boolean isTemperatureNormal(double temperature) {
        return temperature >= 36.0 && temperature <= 37.5;
    }

    private boolean isBloodPressureNormal(float[] bloodPressure) {
        return bloodPressure[0] >= 90 && bloodPressure[0] <= 120 && bloodPressure[1] >= 60 && bloodPressure[1] <= 80;
    }

    private boolean isHeartRateNormal(int heartRate) {
        return heartRate >= 60 && heartRate <= 100;
    }

    private boolean isCritical(double temperature, float[] bloodPressure, int heartRate) {
        return temperature > 39.0 || temperature < 35.0 || bloodPressure[0] > 180 || bloodPressure[0] < 80 || heartRate > 130 || heartRate < 40;
    }
}
