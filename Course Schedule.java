class Solution
{
    static int[] findOrder(int n, int m, ArrayList<ArrayList<Integer>> li) 
    {
        // add your code here
        int top[]=new int[n];
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i, new ArrayList<Integer>());
        }
        for(int i=0;i<m;i++){
            map.get(li.get(i).get(1)).add(li.get(i).get(0));
            top[li.get(i).get(0)]++;
        }
        int ans[]=new int[n];
        Arrays.fill(ans,-1);
        int p=0;
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(top[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int sz=q.size();
            for(int i=0;i<sz;i++){
                int t=q.poll();
                ans[p++]=t;
                
                for(int k:map.get(t)){
                    top[k]--;
                    if(top[k]==0){
                        q.add(k);
                    }
                }
            }
        }
        if(ans[n-1]==-1){
            return new int[]{};
        }
        return ans;
        
        
    }
}