package javaCollections;
import java.util.*;
public class A10 {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"A");
        map.put(2,"B");
        map.remove(1);
        System.out.println(map);
    }
}
