import java.util.*;

public class weekly3_5 {

    static class Student {
        int id;
        String name;
        double cgpa;

        Student(int id, String name, double cgpa) {
            this.id = id;
            this.name = name;
            this.cgpa = cgpa;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        PriorityQueue<Student> pq = new PriorityQueue<>(
            (a, b) -> {
                if (Double.compare(b.cgpa, a.cgpa) != 0)
                    return Double.compare(b.cgpa, a.cgpa);

                if (!a.name.equals(b.name))
                    return a.name.compareTo(b.name);

                return Integer.compare(a.id, b.id);
            }
        );

        for (int i = 0; i < n; i++) {

            String line = sc.nextLine();
            String[] parts = line.split(" ");

            if (parts[0].equals("ENTER")) {

                String name = parts[1];
                double cgpa = Double.parseDouble(parts[2]);
                int id = Integer.parseInt(parts[3]);

                pq.add(new Student(id, name, cgpa));

            } else if (parts[0].equals("SERVED")) {

                if (!pq.isEmpty()) {
                    pq.poll();
                }
            }
        }

        if (pq.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            while (!pq.isEmpty()) {
                Student s = pq.poll();
                System.out.println(s.name);
            }
        }

        sc.close();
    }
}