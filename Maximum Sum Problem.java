class Solution
{
    Map<Integer, Integer> maxSumMap = new HashMap<>();
    
    public int maxSum(int n) 
    { 
        if (n <= 1) { return n; }
        //code here.
        int sum = 0;
        if (maxSumMap.containsKey(n)) { return maxSumMap.get(n); }
        sum = Math.max(n, maxSum(n/2) + maxSum(n/3) + maxSum(n/4));
        maxSumMap.put(n, sum);
        return sum;
    } 
}