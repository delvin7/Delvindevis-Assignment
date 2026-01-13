package javaCollections;

import java.util.*;
public class A1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ravi");
        list.add("Anita");
        list.add("Sunil");
        list.add("Priya");
        list.add("Aman");

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
