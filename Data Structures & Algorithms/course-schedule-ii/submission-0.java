class Solution {
    public int[] findOrder(int n, int[][] arr) {

        int ans[] = new int[n];
        int indeg[] = new int[n];
        Queue<Integer> q = new LinkedList<>();
        List<List<Integer>> ls = new ArrayList<>();
        for(int i = 0;i<n;i++){
            ls.add(new ArrayList<>());
        }
        for(int i = 0;i<arr.length;i++){
            ls.get(arr[i][0]).add(arr[i][1]);
            indeg[arr[i][1]]++;
        }
        for(int i = 0;i<n;i++){
            if(indeg[i]==0){
                q.offer(i);
            }
        }
        int idx =0;
        while(!q.isEmpty()){
            int cur = q.poll();
            ans[n-idx-1] = cur;
            idx++;
            for(int node : ls.get(cur)){
                indeg[node]--;
                if(indeg[node] == 0){
                    q.offer(node);
                } 
            }
        }

        if(idx != n){
            return new int[]{};
        }
        return ans;
    }
}
