class Solution{
    static int minValue(String s, int k){
        // code here
        // Count the frequency of each character
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        // Create a priority queue to store frequencies
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int f : freq) {
            if (f > 0) {
                pq.add(f);
            }
        }

        // Remove k characters
        while (k-- > 0 && !pq.isEmpty()) {
            int top = pq.poll();
            if (top > 1) {
                pq.add(top - 1);
            }
        }

        // Calculate the value
        int value = 0;
        while (!pq.isEmpty()) {
            int f = pq.poll();
            value += f * f;
        }

        return value;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(minValue("abccc", 1)); // Output: 6
        System.out.println(minValue("aabcbcbcabcc", 3)); // Output: 27
    }
}

