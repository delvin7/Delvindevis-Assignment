package javaCollections;
import java.util.*;
public class A2 {
    public static void main(String[] args) {
        ArrayList<Integer> n = new ArrayList<>();
        n.add(10); n.add(20); n.add(30); n.add(40); n.add(50);
        n.remove(2); // remove 30
        System.out.println(n);
    }
}
