class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int top = 0, left = 0,bottom = r-1,right = c-1;
        while(top<=bottom && left <= right)
        {
            for(int i=left;i<=right;i++)
                arr.add(matrix[top][i]);
            top++;
            
            for(int i=top;i<=bottom;i++)
                arr.add(matrix[i][right]);
            right--;
            
            if(top<=bottom){
            for(int i=right;i>=left;i--)
                arr.add(matrix[bottom][i]);
            bottom--;
            }
            
            if(left <= right){
			for(int i=bottom; i >= top; i--)
				arr.add(matrix[i][left]);
            left++;
            }
        }
        return arr;
    }
}