package OOPS.Collection.ArrayList;

import java.util.*;

public class ListTOSet {
    public static void main(String[] args) {
        List<Integer> l= new ArrayList<>();
        l.add(56);
        l.add(7);
        l.add(3);
        l.add(7);
        l.add(8);

        l.add(9);
        l.add(5);
        Set<Integer> st= new HashSet<>(l);
        System.out.println(l);
        System.out.println(st);
        for(int i:st){
            System.out.print(i+"-->");
        }

    }
}
