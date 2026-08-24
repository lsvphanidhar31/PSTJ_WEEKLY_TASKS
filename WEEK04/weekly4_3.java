import java.io.*;
import java.util.*;

public class weekly4_3{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            String s = sc.next();

            int n = s.length();
            int mid = n / 2;

            int[] first = new int[26];
            int[] second = new int[26];

            for (int i = 0; i < mid; i++) {
                first[s.charAt(i) - 'a']++;
            }

            int start = (n % 2 == 0) ? mid : mid + 1;

            for (int i = start; i < n; i++) {
                second[s.charAt(i) - 'a']++;
            }

            if (Arrays.equals(first, second)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
