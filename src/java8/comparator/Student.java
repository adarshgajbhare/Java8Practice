package java8.comparator;

import java.util.*;

public class Student {
    String name;
    int age;
    int roll;
    double marks;

    public Student(String name, int age, int roll, double marks) {
        this.name = name;
        this.age = age;
        this.roll = roll;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", roll=" + roll +
                ", marks=" + marks +
                '}';
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add( new Student("John", 20, 1, 80));
        students.add( new Student("Alice", 18, 2, 90));
        students.add(new Student("Bob", 22, 3, 75));


        Comparator<Student> com = ((s1, s2) ->
                s1.getAge() - s2.getAge());

        Collections.sort(students, com);
        for (Student std : students) {
            System.out.println(std);
        }
    }
}
