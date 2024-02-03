class Solution:
    def fill(self, n, m, mat):
        # code here
        mr = len(mat)
        mc = len(mat[0])
        start = []
        dup = [[-1 for _ in range(mc)] for _ in range(mr)]
        codes = [[-1,0],[0,-1],[0,1],[1,0]]
        
        for c in [0,mc-1]:
            for r in range(mr):
                if mat[r][c] == 'O':
                    start.append((r,c))
        
        for r in [0,mr-1]:
            for c in range(1,mc-1):
                if mat[r][c] == 'O':
                    start.append((r,c))
        
        
        def dfs(node):
            r , c = node
            dup[r][c] = 1
            
            for pos in codes:
                nr = r + pos[0]
                nc = c + pos[1]
                
                if nr >= 0 and nc >=0 and nr < mr and nc < mc and dup[nr][nc] != 1 and mat[nr][nc] == 'O':
                    dfs((nr,nc))
        
        for node in start:
            r,c = node
            if dup[r][c] != 1:
                dfs(node)
        
        for r in range(mr):
            for c in range(mc):
                if dup[r][c] != 1:
                    mat[r][c] ='X'
        return mat