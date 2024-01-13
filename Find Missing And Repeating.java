class Solve {
    int[] findTwoElement(int arr[], int n) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int repeat=0;
        int missing =0;
        for(int i=0;i<n;i++){
            if(!hm.containsKey(arr[i])){
                hm.put(arr[i],1);
            }else{
                repeat=arr[i];
            }
        }
        for(int i=1;i<=n;i++){
            if(!hm.containsKey(i)){
                missing=i;
            }
        }
       int[] ans = new int[2];
        ans[0] = repeat; 
        ans[1] = missing; 
        return ans;
    }
}