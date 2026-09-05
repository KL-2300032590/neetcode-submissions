class Solution {
    public int findJudge(int n, int[][] trust) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        int indeg[] = new int[n+1];
        for(int i = 0;i<trust.length;i++){
            int e[] = trust[i];
            adj.get(e[0]).add(e[1]);
            indeg[e[1]]++;
        }
        for(int i =0;i<=n;i++){
            if(indeg[i]==n-1 && adj.get(i).isEmpty())return i;
        }
        return -1;
        
    }
}