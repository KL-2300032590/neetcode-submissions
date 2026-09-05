class Solution {
    public boolean validTree(int n, int[][] edges) {

        if(edges.length != n-1)return false;
        
        List<List<Integer>> adj = new ArrayList<>();
        for(int i =0;i<n;i++){
            adj.add(new ArrayList<>());
        }
         for(int i[] : edges){
            int u = i[0],v = i[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        boolean vis[] = new boolean[n];
        
        dfs(0,vis,adj);
        for(int i =0;i<n;i++){
            if(!vis[i])return false;
        }
        
        return true;
    }

    public void dfs(int node,boolean vis[],List<List<Integer>> adj){
         vis[node] = true;
         for(int nei : adj.get(node)){
            if(!vis[nei]){
                dfs(nei,vis,adj);
            }
         }
    }
}
