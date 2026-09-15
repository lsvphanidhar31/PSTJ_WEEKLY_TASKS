import java.util.*;
import java.util.function.*;

public class weekly1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int type = sc.nextInt();
            int num = sc.nextInt();

            if (type == 1) {
                Predicate<Integer> checkOdd = n -> n % 2 != 0;
                System.out.println(checkOdd.test(num) ? "ODD" : "EVEN");

            } else if (type == 2) {
                Predicate<Integer> checkPrime = n -> {
                    if (n < 2) return false;

                    for (int i = 2; i * i <= n; i++) {
                        if (n % i == 0) return false;
                    }

                    return true;
                };

                System.out.println(checkPrime.test(num) ? "PRIME" : "COMPOSITE");

            } else if (type == 3) {
                Predicate<Integer> checkPalindrome = n -> {
                    String s = String.valueOf(n);
                    String rev = new StringBuilder(s).reverse().toString();
                    return s.equals(rev);
                };

                System.out.println(checkPalindrome.test(num)
                        ? "PALINDROME"
                        : "NOT PALINDROME");
            }
        }

        sc.close();
    }
}
