class Solution:
    def smallestpositive(self, arr, n):
        mis=1
        arr.sort()
        for i in range(n):
            if mis<arr[i]:
                return mis
            else:
                mis+=arr[i]
        return mis