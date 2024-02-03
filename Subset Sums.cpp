class Solution
{
public:
    void findsubsetsum(int ind,int sum,vector<int> &arr,int n,vector<int> &ans)
    {
        if(ind==n)
        {
            ans.push_back(sum);
            return;
        }
        sum+=arr[ind];
        findsubsetsum(ind+1,sum,arr,n,ans);
        sum-=arr[ind];
        findsubsetsum(ind+1,sum,arr,n,ans);
    }
    vector<int> subsetSums(vector<int> arr, int N)
    {
        vector<int> ans;
        findsubsetsum(0,0,arr,N,ans);
        sort(ans.begin(),ans.end());
        return ans;
    }
};