class Solution {

    int search(String word, String text) {
        int n = text.length();
        int m = word.length();
        Map<Character, Integer> freqWord = new HashMap<>();
        Map<Character, Integer> freqText = new HashMap<>();
        int count = 0;
        for (char c : word.toCharArray()) {
            freqWord.put(c, freqWord.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < n; i++) {
            char currentChar = text.charAt(i);
            freqText.put(currentChar, freqText.getOrDefault(currentChar, 0) + 1);
            if (i >= m) {
                char removedChar = text.charAt(i - m);
                if (freqText.get(removedChar) == 1) {
                    freqText.remove(removedChar);
                } else {
                    freqText.put(removedChar, freqText.get(removedChar) - 1);
                }
            }
            if (i >= m - 1 && freqText.equals(freqWord)) {
                count++;
            }
        }
 
        return count;
    }
}