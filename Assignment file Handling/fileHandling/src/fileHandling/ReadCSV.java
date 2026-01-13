package fileHandling;

import java.io.*;

public class ReadCSV {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("students.csv"));
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
