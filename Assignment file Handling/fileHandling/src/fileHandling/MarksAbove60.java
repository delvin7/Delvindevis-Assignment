package fileHandling;

import java.io.*;

public class MarksAbove60 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("students.csv"));
            String line;
            br.readLine(); // skip header

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int marks = Integer.parseInt(data[2]);

                if (marks > 60) {
                    System.out.println(line);
                }
            }
            br.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
