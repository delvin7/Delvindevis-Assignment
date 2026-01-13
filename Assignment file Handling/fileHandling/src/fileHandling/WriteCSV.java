package fileHandling;

import java.io.FileWriter;

public class WriteCSV {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("students.csv");

            fw.write("id,name,marks\n");
            fw.write("101,Ravi,78\n");
            fw.write("102,Anita,85\n");
            fw.write("103,Sunil,35\n");
            fw.write("104,Priya,92\n");
            fw.write("105,Aman,45\n");

            fw.close();
            System.out.println("CSV file created successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
