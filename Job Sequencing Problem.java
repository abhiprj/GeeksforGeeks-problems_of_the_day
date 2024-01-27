class Comp implements Comparator<Job>{
    public int compare(Job j1, Job j2){
        if(j1.profit>j2.profit){
            return -1;
        }else if(j1.profit==j2.profit){
            if(j1.deadline>j2.deadline){
                return -1;
            }else{
                return 1;
            }
        }else{
            return 1;
        }
    }
}

class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
        PriorityQueue<Job> pq = new PriorityQueue<>(new Comp());
        int max = 0;
        for(int i=0;i<n;i++){
            pq.add(arr[i]);
            if(arr[i].deadline>max){
                max=arr[i].deadline;
            }
        }
        int ans[] = new int[max+1];
        int m=max;
        while(!pq.isEmpty()){
            Job jb = pq.poll();
            // System.out.println(jb.id+" "+jb.profit+" "+jb.deadline);
            if(ans[jb.deadline]==0){
                ans[jb.deadline]=jb.profit;
            }else{
            for(int k=jb.deadline;k>0;k--){
                if(ans[k]==0){
                ans[k]=jb.profit;
                break;
            }
            }
            }
        }
        // while(!pq.isEmpty()){
        //     Job j1 = pq.poll();
        //     System.out.println(j1.id+" "+j1.profit+" "+j1.deadline);
        // }
        max=0;
        int an=0;
        for(int i=0;i<=m;i++){
            // System.out.println(i+" "+ans[i]);
            if(ans[i]!=0){
                an+=ans[i];
                max++;
            }
        }
        int[] rt = new int[2];
        rt[0]=max;
        rt[1]=an;
        return rt;
    }
}