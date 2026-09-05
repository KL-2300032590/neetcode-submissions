class Solution {
    public int countComponents(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
    
        for(int i = 0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i[] : edges){
            int u = i[0],v = i[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        int cnt=0;
        boolean vis[] = new boolean[n+1];
        
        for(int i =0;i<n;i++){
            if(!vis[i]){
                cnt++;
                dfs(i,adj,vis);
            }
        }
        return cnt;
    }

    public void dfs(int node,List<List<Integer>> adj,boolean vis[]){
        vis[node] = true;
        for(int nei : adj.get(node)){   
            if(!vis[nei]){
                dfs(nei,adj,vis);
            }
        }
    }
   
}

