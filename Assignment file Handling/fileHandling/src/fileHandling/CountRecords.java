package fileHandling;

import java.io.*;

public class CountRecords {
    public static void main(String[] args) {
        int count = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader("students.csv"));
            br.readLine(); // skip header
            while (br.readLine() != null) {
                count++;
            }
            br.close();
            System.out.println("Total Students = " + count);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
