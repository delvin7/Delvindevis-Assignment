package fileHandling;
import java.io.*;

public class Topper {
    public static void main(String[] args) {
        String topper = "";
        int max = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader("students.csv"));
            String line;
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int marks = Integer.parseInt(data[2]);

                if (marks > max) {
                    max = marks;
                    topper = data[1];
                }
            }
            br.close();
            System.out.println("Topper: " + topper + " with " + max + " marks");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
