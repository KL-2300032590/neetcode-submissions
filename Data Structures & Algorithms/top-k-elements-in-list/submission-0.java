class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mp = new HashMap<>();
        int n = nums.length;
        for(int i =0;i<n;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->{
            return a[0]-b[0];
        });
        
        for(Map.Entry<Integer,Integer> i : mp.entrySet()){
            pq.offer(new int[]{i.getValue(),i.getKey()});
            if(pq.size() >k){
                pq.poll();
            }
        }

        int ans[] = new int[k];
        for(int i =0;i<k;i++){
            ans[i] = pq.poll()[1];
        }
        return ans;

    }
}
