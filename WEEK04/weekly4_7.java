import java.io.*;
import java.util.*;

public class weekly4_7 {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int n = arr.size();
        int left = 0;
        int right = 0;

        for (int i = 0; i < n; i++) {
            left += arr.get(i).get(i);
            right += arr.get(i).get(n - 1 - i);
        }

        return Math.abs(left - right);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                row.add(Integer.parseInt(input[j]));
            }

            arr.add(row);
        }

        int result = diagonalDifference(arr);

        System.out.println(result);
    }
}
