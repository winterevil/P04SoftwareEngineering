package umbrella.hospital.p04.dao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public abstract class ObjectDAO<T> {
    protected String filePath;
    protected String header;
    
    public ObjectDAO(String filePath){
        this.filePath = filePath;
    }

    public ObjectDAO(String filePath, String header) {
        this.filePath = filePath;
        this.header = header;
    }

    public abstract ArrayList<T> Read();

    public void Save(ArrayList<T> objects) {
        File file = new File(filePath);
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for (T object : objects) {
                String line = object.toString();
                bw.write(line);
            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void SaveWithHeader(ArrayList<T> objects) {
        File file = new File(filePath);
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            if(header == null || header.isEmpty()){
                System.out.println("Header is empty.");
                bw.close();
                return;
            }
            bw.write(header);
            bw.newLine();
            for (T object : objects) {
                String line = object.toString();
                bw.write(line);
            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
