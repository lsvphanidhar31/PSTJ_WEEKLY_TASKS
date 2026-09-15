import java.util.*;

class Student {
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }
}

class StudentComparator implements Comparator<Student> {
    public int compare(Student a, Student b) {
        if (a.getCgpa() != b.getCgpa()) {
            return Double.compare(b.getCgpa(), a.getCgpa());
        }

        if (!a.getName().equals(b.getName())) {
            return a.getName().compareTo(b.getName());
        }

        return Integer.compare(a.getId(), b.getId());
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            double cgpa = sc.nextDouble();

            students.add(new Student(id, name, cgpa));
        }

        Collections.sort(students, new StudentComparator());

        for (Student s : students) {
            System.out.println(s.getName());
        }

        sc.close();
    }
}
