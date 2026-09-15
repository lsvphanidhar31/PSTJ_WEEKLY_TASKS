class weekly6_10 {

    public boolean isCircularPalindrome(String s) {
        int n = s.length();

        for (int start = 0; start < n; start++) {

            int left = start;
            int right = start + n - 1;

            while (left < right) {

                char leftChar = s.charAt(left % n);
                char rightChar = s.charAt(right % n);

                if (leftChar != rightChar) {
                    break;
                }

                left++;
                right--;
            }

            if (left >= right) {
                return true;
            }
        }

        return false;
    }
}
