import java.util.Scanner;

public class weekly3_1 {

    public static int daysBetweenDates(String date1, String date2) {

        int days1 = countDays(date1);
        int days2 = countDays(date2);

        return Math.abs(days1 - days2);
    }

    public static int countDays(String date) {

        String[] parts = date.split("-");

        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        int[] days = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        int total = year * 365;

        // Add leap year days
        total += year / 4;
        total -= year / 100;
        total += year / 400;

        // Add previous months
        for (int i = 0; i < month - 1; i++) {
            total += days[i];
        }

        // Add extra day for leap year
        if (month > 2 && isLeapYear(year)) {
            total++;
        }

        // Add current day
        total += day;

        return total;
    }

    public static boolean isLeapYear(int year) {

        if (year % 400 == 0) {
            return true;
        }

        if (year % 100 == 0) {
            return false;
        }

        if (year % 4 == 0) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String date1 = sc.next();
        String date2 = sc.next();

        int result = daysBetweenDates(date1, date2);

        System.out.println(result);

        sc.close();
    }
}