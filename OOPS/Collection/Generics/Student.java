package OOPS.Collection.Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class Student<T extends  Number> {           //extands number  indicate T will be num bout dont know about its type

    private  String name;
    private T age;
    public Student(String name, T age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public T getAge() {
        return age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    //method level generics
    <k>void displayGread(k grade){
        if(grade instanceof Integer)
            System.out.println(grade);
        System.out.println("A");
    }

    public static void main(String[] args) {
//        Student< Integer> s1 = new Student<>("Raj", 21);
//        s1.display();
//
//        Student<Double> s2 = new Student<>("Aman", 20.5);
//        s2.display();
//        s1.displayGread(4);

        Student<? super Number > s2 = new Student<>("Raj", 21);
        s2.displayGread(5.4);
        ArrayList<? super String > list = new ArrayList<>(Arrays.asList("a","b")); // in this we only pass number
        list.add("a");
        Object s3 = list.get(0);

       // diff btw  <? extands number>, <T extands number>
    }
}
