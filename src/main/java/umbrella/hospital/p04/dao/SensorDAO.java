package umbrella.hospital.p04.dao;

import umbrella.hospital.p04.model.PredefinedSensors;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class SensorDAO extends ObjectDAO {

    private static final String filePath = System.getProperty("user.dir") + "/src/main/java/umbrella/hospital/p04/data/sensors.ser";
    private static SensorDAO instance;

    public SensorDAO() {
        super(filePath);
        File file = new File(filePath);
        File parentDir = file.getParentFile();

        if (!parentDir.exists()) {
            parentDir.mkdirs();
        }

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static SensorDAO getInstance() {
        if (instance == null) {
            instance = new SensorDAO();
        }
        return instance;
    }

    @Override
    public ArrayList<PredefinedSensors> Read() {
        return readSensors();
    }

    public static ArrayList<PredefinedSensors> readSensors() {
        ArrayList<PredefinedSensors> sensors = new ArrayList<>();
        ObjectInputStream ois = null;
        try {
            ByteArrayInputStream bis = new ByteArrayInputStream(Files.readAllBytes(Path.of(filePath)));
            ois = new ObjectInputStream(bis);

            sensors = (ArrayList<PredefinedSensors>) ois.readObject();

            ois.close();
            bis.close();
        } catch (EOFException eofException) {
            return sensors;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sensors;
    }

    public static void saveSensors(ArrayList<PredefinedSensors> sensors) {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);

            oos.writeObject(sensors);
            Files.write(Path.of(filePath), bos.toByteArray());

            oos.close();
            bos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}