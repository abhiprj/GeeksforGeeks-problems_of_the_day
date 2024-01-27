class Solution {
    public static int count(int arr[],int n,int x){
        int count = 0;
        for(int i = 0;i<n;i++){
            if(arr[i]==x){
                count++;
            }
        }
        return count;
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    //creating array of that size
    int arr[]=new int[n];
    //taking output
    for(int i =0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    n=count(arr, n, x);
}
}