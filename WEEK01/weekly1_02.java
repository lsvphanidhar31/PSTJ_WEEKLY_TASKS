import java.util.*;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("John", 25));
        students.add(new Student("Alice", 20));
        students.add(new Student("Bob", 22));

        students.sort((a, b) -> a.age - b.age);

        for (Student s : students) {
            System.out.println(s.name + " " + s.age);
        }
    }
}
