class Solution {
    int[][] path = { {-1,0},{1,0},{0,-1},{0,1}};
    int n;
    int m;
    public List<List<Integer>> pacificAtlantic(int[][] arr) {
        n = arr.length;
        m = arr[0].length;
        boolean pac[][] = new boolean[n][m];
        boolean atl[][] = new boolean[n][m];
        for(int j =0;j<m;j++){
            dfs(0,j,pac,arr);
            dfs(n-1,j,atl,arr);
        }
        for(int i = 0;i<n;i++){
            dfs(i,0,pac,arr);
            dfs(i,m-1,atl,arr);
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(pac[i][j] && atl[i][j]){
                    ans.add(Arrays.asList(i,j));
                }
            }
        }
        return ans;
    }
    public void dfs(int i,int j,boolean vis[][],int arr[][]){
        vis[i][j] = true;
        for(int k = 0;k<4;k++){
            int nr = i + path[k][0];
            int nc = j + path[k][1];
            if(nr >= 0 && nc >= 0 && nr < n && nc < m && !vis[nr][nc] && arr[i][j] <= arr[nr][nc]){
                dfs(nr,nc,vis,arr);
            }
        }
    }
}