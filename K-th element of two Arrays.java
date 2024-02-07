







class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        ArrayList<Integer> set = new ArrayList<>();
        
        for(int i:arr1){
            set.add(i);
        }
        for(int j:arr2){
            set.add(j);
        }
        
        Collections.sort(set);
        
        return set.get(k-1);
    }
}
