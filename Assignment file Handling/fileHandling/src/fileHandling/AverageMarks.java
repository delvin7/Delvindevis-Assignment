package fileHandling;
import java.io.*;

public class AverageMarks {
    public static void main(String[] args) {
        int sum = 0, count = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader("students.csv"));
            String line;
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                sum += Integer.parseInt(data[2]);
                count++;
            }
            br.close();
            System.out.println("Average = " + (sum / count));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
