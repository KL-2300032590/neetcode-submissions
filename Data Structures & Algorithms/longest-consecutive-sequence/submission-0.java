class Solution {
    public int longestConsecutive(int[] a) {
        Set<Integer> hs = new HashSet<>();
        int n = a.length;

        for(int i : a){
            hs.add(i);
        }

        int ans=0;

        for(int i : a){
            if(!hs.contains(i-1)){
                int cur =1;
                while(hs.contains(i+cur)){
                    cur++;
                }
                ans = Math.max(ans,cur);
            }
        }
        
        return ans;
    }
}
