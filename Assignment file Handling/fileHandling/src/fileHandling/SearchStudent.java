package fileHandling;
import java.io.*;

public class SearchStudent {
    public static void main(String[] args) {
        String search = "Anita";
        try {
            BufferedReader br = new BufferedReader(new FileReader("students.csv"));
            String line;
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[1].equalsIgnoreCase(search)) {
                    System.out.println("Found: " + line);
                }
            }
            br.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
