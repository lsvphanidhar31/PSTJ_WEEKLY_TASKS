import java.io.*;
import java.util.*;

public class weekly4_10 {

    public static void matrixRotation(List<List<Integer>> matrix, int r) {
        int m = matrix.size();
        int n = matrix.get(0).size();

        int[][] a = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = matrix.get(i).get(j);
            }
        }

        int layers = Math.min(m, n) / 2;

        for (int layer = 0; layer < layers; layer++) {
            List<Integer> list = new ArrayList<>();

            int top = layer;
            int left = layer;
            int bottom = m - 1 - layer;
            int right = n - 1 - layer;

            for (int j = left; j <= right; j++)
                list.add(a[top][j]);

            for (int i = top + 1; i <= bottom; i++)
                list.add(a[i][right]);

            for (int j = right - 1; j >= left; j--)
                list.add(a[bottom][j]);

            for (int i = bottom - 1; i > top; i--)
                list.add(a[i][left]);

            int len = list.size();
            int shift = r % len;

            List<Integer> rotated = new ArrayList<>();

            for (int i = shift; i < len; i++)
                rotated.add(list.get(i));

            for (int i = 0; i < shift; i++)
                rotated.add(list.get(i));

            int index = 0;

            for (int j = left; j <= right; j++)
                a[top][j] = rotated.get(index++);

            for (int i = top + 1; i <= bottom; i++)
                a[i][right] = rotated.get(index++);

            for (int j = right - 1; j >= left; j--)
                a[bottom][j] = rotated.get(index++);

            for (int i = bottom - 1; i > top; i--)
                a[i][left] = rotated.get(index++);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] first = br.readLine().split(" ");

        int m = Integer.parseInt(first[0]);
        int n = Integer.parseInt(first[1]);
        int r = Integer.parseInt(first[2]);

        List<List<Integer>> matrix = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            String[] input = br.readLine().split(" ");
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                row.add(Integer.parseInt(input[j]));
            }

            matrix.add(row);
        }

        matrixRotation(matrix, r);
    }
}
