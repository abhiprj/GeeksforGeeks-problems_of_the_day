class Solution
{
    public:
    // int firstOccur(int arr[], int n, int x)
    vector<int> find(int arr[], int n , int x )
    {
        // code here
        // first occurence 
        int start = 0;
        int end = n-1;
        int first = -1;
        
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == x){
                if(arr[start] == x){
                    first = start;
                    break;
                }
                if(mid-1 >= 0 && arr[mid] != arr[mid - 1]){
                    first = mid;
                    break;
                }
                end = mid - 1;
            }else if(arr[mid] < x){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        
        start = 0;
        end = n-1;
        int second = -1;
        
        while(start <= end){
            int mid = start + (end - start) / 2;
            
            if(arr[mid] == x){
                if(arr[end] == x){
                    second = end;
                    break;
                }
                if(mid + 1 < n && arr[mid] != arr[mid+1]){
                    second = mid;
                    break;
                }
                start = mid + 1;
            }else if(arr[mid] < x){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        
        
        // cout << first ;
        // cout << second << endl;
        
        return {first, second};
    }
};