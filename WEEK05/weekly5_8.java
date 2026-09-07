class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new ArrayList<>();

        for (String word : words) {
            if (match(word, pattern)) {
                result.add(word);
            }
        }

        return result;
    }

    private boolean match(String word, String pattern) {
        int[] map1 = new int[26];
        int[] map2 = new int[26];

        for (int i = 0; i < word.length(); i++) {
            int a = word.charAt(i) - 'a';
            int b = pattern.charAt(i) - 'a';

            if (map1[a] != map2[b]) {
                return false;
            }

            map1[a] = i + 1;
            map2[b] = i + 1;
        }

        return true;
    }
}
