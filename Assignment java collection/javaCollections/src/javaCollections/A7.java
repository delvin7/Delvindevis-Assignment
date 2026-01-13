package javaCollections;
import java.util.*;
public class A7 {
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");

        for(String c: colors){
            System.out.println(c);
        }
    }
}
