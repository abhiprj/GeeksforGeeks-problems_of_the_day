class Solution {
public:
	int isPossible(vector<vector<int>>paths){
	    // Code here
	        int row = paths.size();
	    int col = paths[0].size();
	    int count = 0;
	    
	    for(int i = 0; i < row; i++){
	        for(int j = 0; j < col; j++){
	            if(paths[i][j] == 1){
	                count++;
	            }
	        }
	        if(count%2 != 0){
	            return 0;
	        }
	    }
	    return 1;
	}

};