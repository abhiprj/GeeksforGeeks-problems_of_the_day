class Solution{
public:
	bool recreationalSpot(int arr[], int n){
		// Your code goes here 

        stack<int> st;

        int thirdElement = INT_MIN; //nums[k]

        for(int index = n - 1; index >= 0; index--){
            if(arr[index] < thirdElement){
                return true;
            }
            while(!st.empty() && st.top() < arr[index]){
                thirdElement = st.top();
                st.pop();
            }
            st.push(arr[index]);
        }
        return false;
	}
};
