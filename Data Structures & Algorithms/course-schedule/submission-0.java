class Solution {
    public boolean canFinish(int n, int[][] p) {
        int in[] = new int[n];
        List<List<Integer>> adj = new ArrayList<>();
        for(int i =0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i[] :p){
            int u = i[0];
            int v = i[1];
            adj.get(u).add(v);

            in[i[1]]++;
        }
        Queue<Integer> q= new LinkedList<>();
        for(int i =0;i<n;i++){
            if(in[i]==0)q.offer(i);
        }

        while(!q.isEmpty()){
            int cur = q.poll();
            for(int i : adj.get(cur)){
                in[i]--;
                if(in[i]==0)q.offer(i);
            }
        }

        for(int i =0;i<n;i++){
            if(in[i]!=0)return false;
        }
        return true;
    }
}
