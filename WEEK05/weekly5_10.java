class weekly5_10 {
    public static void search(String pat, String txt) {
        int n = txt.length();
        int m = pat.length();

        for (int i = 0; i <= n - m; i++) {
            int j;

            for (j = 0; j < m; j++) {
                if (txt.charAt(i + j) != pat.charAt(j)) {
                    break;
                }
            }

            if (j == m) {
                System.out.print(i + " ");
            }
        }
    }
}
