package javaCollections;
import java.util.*;
public class A4 {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<>();
        courses.add("Java");
        courses.add("Python");
        courses.add("SQL");
        courses.add("Spring");
        courses.add("HTML");

        for(String c : courses){
            System.out.println(c);
        }
    }
}
