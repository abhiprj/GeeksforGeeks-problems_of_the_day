class Solution: 
    def luckyPermutations(self, N, M, arr, graph):
        from collections import defaultdict
        vi=defaultdict(int)
        for i,v in enumerate(arr):
            vi[v]|=1<<i
        adj=defaultdict(int)
        for fm,to in graph:
            fmi=vi[fm]
            toi=vi[to]
            adj[fmi]|=toi
            adj[toi]|=fmi
        from functools import lru_cache
        @lru_cache(None)
        def dp(cur,ava=(1<<N)-1):
            nonlocal N,adj,vi
            if not ava^(ava&-ava):
                return 1
            ans=0
            tmp=None
            for i in adj:
                if i&cur:
                    tmp=adj[i]
                    break
            if not tmp:
                return 0
            tmp&=ava
            if not tmp:
                return 0
            nava=ava^cur
            while tmp:
                rmb=tmp&-tmp
                ans+=dp(rmb,nava)
                tmp^=rmb
            return ans
        return sum(dp(1<<x,(1<<N)-1) for x in range(N))