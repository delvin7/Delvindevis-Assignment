package javaCollections;
import java.util.*;
public class A9 {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("IN","India");
        map.put("US","USA");

        for(Map.Entry<String,String> e: map.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
