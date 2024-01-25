class Solution {
    boolean checkTriplet(int[] arr, int n) {
        // code here
        if(n<3){
	        return false;
	    }
	    Arrays.sort(arr);
	    for(int i=n-1;i>=2;i--){
	        int sum1=arr[i]*arr[i];
	        int a=0,b=i-1;
	        while(a<b){
	            if(arr[i]==arr[i-1]){
	                break;
	            }
	            int sum2=(arr[a]*arr[a])+(arr[b]*arr[b]);
	            if(sum1==sum2){
	                return true;
	            }
	            else if(sum1>sum2){
	                a++;
	            }
	            else{
	                b--;
	            }
	        }
	    }
	    return false;
    }
}