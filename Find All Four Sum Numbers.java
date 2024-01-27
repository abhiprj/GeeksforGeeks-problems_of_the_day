class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        // code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        int size = arr.length;
        for(int i=0;i<size;i++){
            if(i>0 && arr[i-1]==arr[i]){
                continue;
            }
            for(int j=i+1;j<size;j++){
                int l = j+1, m=size-1;
                if(j>i+1 && arr[j-1]==arr[j]){
                    continue;
                }
                while(l<m){
                    int sum = arr[i]+arr[j]+arr[l]+arr[m];
                    if(sum==k){
                        ArrayList<Integer> quadruple = new ArrayList<>();
                        quadruple.add(arr[i]);
                        quadruple.add(arr[j]);
                        quadruple.add(arr[l]);
                        quadruple.add(arr[m]);
                        res.add(quadruple);
                        l++;
                        m--;
                        while(l<m && arr[l]==arr[l-1]){
                            l++;
                        }
                        while(l<m && arr[m]==arr[m+1]){
                            m--;
                        }
                    } else if(sum>k){
                        m--;
                    } else{
                        l++;
                    }
                }
            }
        }
        return res;
    }
}