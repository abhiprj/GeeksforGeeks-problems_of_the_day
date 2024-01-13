class Solution
{
    public:
    int peakElement(int arr[], int n)
    {
       // Your code here
       int low=0;
       int high=n-1;
   while (low <= high) {
        int mid = low + (high - low) / 2;

        // Check if arr[mid] is a peak
        if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n - 1 || arr[mid + 1] <= arr[mid])) {
            return mid;
        }

        // If the element to the right is greater, search in the right half
        if (mid < n - 1 && arr[mid] < arr[mid + 1]) {
            low = mid + 1;
        } else {
            // If the element to the left is greater, search in the left half
            high = mid - 1;
        }
    }
    }
};