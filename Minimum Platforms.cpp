










class Solution{
    public:
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    	int findPlatform(int arr[], int dep[], int n) {
    // Sorting the arrival and departure arrays
    sort(arr, arr + n);
    sort(dep, dep + n);

    int platforms = 1, result = 1;
    int i = 1, j = 0;

    // Similar to merge in merge sort to process all events in sorted order
    while (i < n && j < n) {
        // If the next event in sorted order is arrival, increment the platform needed
        if (arr[i] <= dep[j]) {
            platforms++;
            i++;
        }
        // If the next event is departure, decrement the platform needed
        else if (arr[i] > dep[j]) {
            platforms--;
            j++;
        }

        // Update the result if needed
        if (platforms > result)
            result = platforms;
    }

    return result;
    }
};
