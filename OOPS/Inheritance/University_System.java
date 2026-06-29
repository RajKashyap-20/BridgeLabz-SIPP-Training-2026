package OOPS.Inheritance;
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Name: " + name + "\nAge: " + age;
    }
}

class Student extends Person {
    final int studentId;
    double gpa;

    Student(String name, int age, int studentId, double gpa) {
        super(name, age);
        this.studentId = studentId;
        this.gpa = gpa;
    }

    public String toString() {
        return super.toString() +
                "\nStudent ID: " + studentId +
                "\nGPA: " + gpa;
    }
}

class GradStudent extends Student {
    String thesis;

    GradStudent(String name, int age, int studentId, double gpa, String thesis) {
        super(name, age, studentId, gpa);
        this.thesis = thesis;
    }

    public String toString() {
        return super.toString() +
                "\nThesis: " + thesis;
    }
}

public class University_System {
    public static void main(String[] args) {

        GradStudent g = new GradStudent("Raj",22,101,8.7,"AI in Healthcare");

        System.out.println(g);

        if(g instanceof Student)
            System.out.println("\nGradStudent IS-A Student");

        if(g instanceof Person)
            System.out.println("GradStudent IS-A Person");
    }
}