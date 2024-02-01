class Solution {
  public static double findSmallestMaxDist(int stations[],int K) {
    double low = 0, high = (double)maxDistance(stations);
    while(high-low > (1e-9))
    {
        double mid = (low + high) / 2.0;
        if(chkPossible(stations, mid, K)==true)
            high = mid;
        else
            low = mid;
    }
    return high;
  }
  public static int maxDistance(int[] nums)
  {
      int n = nums.length, maxi = Integer.MIN_VALUE;
      for(int index = 0; index < n-1; index++)
        maxi = Math.max(maxi, nums[index+1]-nums[index]);
    
    return maxi;
  }
  public static boolean chkPossible(int[] nums, double dist, int k)
  {
      int cntPlace = 0, n = nums.length;
      
      for(int index = 1; index < n; index++)
      {
          int diff = (int)((nums[index]-nums[index-1]) / dist);
          if((diff * dist) == (nums[index]-nums[index-1]))
                diff--;
          cntPlace += diff;   
      }
      return (cntPlace <= k) ? true : false;
  }
}