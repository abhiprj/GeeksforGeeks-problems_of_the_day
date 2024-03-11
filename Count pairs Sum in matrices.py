#User function Template for python3

class Solution:
    def countPairs(self, mat1, mat2, n, x):
        count = 0
        # Create a dictionary to store elements of mat1 for quick lookup
        mat1_dict = {}
        
        # Iterate over each element in mat1 and store it in the dictionary
        for i in range(n):
            for j in range(n):
                mat1_dict[mat1[i][j]] = mat1_dict.get(mat1[i][j], 0) + 1
        
        # Iterate over each element in mat2 and check if x - current element exists in mat1_dict
        for i in range(n):
            for j in range(n):
                if x - mat2[i][j] in mat1_dict:
                    count += mat1_dict[x - mat2[i][j]]
        
        return count