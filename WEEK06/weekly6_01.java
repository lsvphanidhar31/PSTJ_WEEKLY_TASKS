public static long stringSimilarity(String s) {
    int n = s.length();
    long sum = 0;

    for (int i = 0; i < n; i++) {
        int j = 0;

        while (i + j < n && s.charAt(j) == s.charAt(i + j)) {
            j++;
        }

        sum += j;
    }

    return sum;
}
