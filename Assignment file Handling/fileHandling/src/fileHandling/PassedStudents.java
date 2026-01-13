package fileHandling;
import java.io.*;

public class PassedStudents {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("students.csv"));
            FileWriter fw = new FileWriter("passed_students.csv");

            String line = br.readLine();
            fw.write(line + "\n");

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int marks = Integer.parseInt(data[2]);

                if (marks >= 50) {
                    fw.write(line + "\n");
                }
            }
            br.close();
            fw.close();
            System.out.println("Passed students file created");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
