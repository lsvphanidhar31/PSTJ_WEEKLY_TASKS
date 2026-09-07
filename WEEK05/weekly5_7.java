class weekly5_7 {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLength = 0;
        int[] last = new int[128];

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            left = Math.max(left, last[c]);
            maxLength = Math.max(maxLength, right - left + 1);

            last[c] = right + 1;
        }

        return maxLength;
    }
}
