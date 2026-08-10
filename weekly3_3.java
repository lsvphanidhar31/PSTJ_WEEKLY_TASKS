import java.util.Scanner;

public class weekly3_3 {

    public static int dayOfYear(String date) {
        String[] parts = date.split("-");

        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        int[] days = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        int result = 0;

        for (int i = 0; i < month - 1; i++) {
            result += days[i];
        }

        if (month > 2 && isLeapYear(year)) {
            result++;
        }

        result += day;

        return result;
    }

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        }

        if (year % 100 == 0) {
            return false;
        }

        return year % 4 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String date = sc.next();

        System.out.println(dayOfYear(date));

        sc.close();
    }
}