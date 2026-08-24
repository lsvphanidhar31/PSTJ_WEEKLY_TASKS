import java.util.*;

class weekly4_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            String s = sc.next();

            int[] count1 = new int[26];
            int[] count2 = new int[26];

            int n = s.length();
            int mid = n / 2;

            for (int i = 0; i < mid; i++) {
                count1[s.charAt(i) - 'a']++;
            }

            int start = (n % 2 == 0) ? mid : mid + 1;

            for (int i = start; i < n; i++) {
                count2[s.charAt(i) - 'a']++;
            }

            if (Arrays.equals(count1, count2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
