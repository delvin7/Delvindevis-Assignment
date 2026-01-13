package fileHandling;
import java.io.*;

public class ValidateCSV {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("students.csv"));
            String line;
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                try {
                    int marks = Integer.parseInt(data[2]);
                    System.out.println(line);
                } catch (NumberFormatException e) {
                    // ignore invalid record
                }
            }
            br.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
