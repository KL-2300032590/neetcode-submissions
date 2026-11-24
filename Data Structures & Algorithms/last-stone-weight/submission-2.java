class Solution {
    public int lastStoneWeight(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0;i<arr.length;i++){
            pq.offer(arr[i]);
        }
        while(pq.size() > 1){
            int a = pq.poll();
            int b = pq.poll();
            if(a > b)
            pq.offer(a-b);
        }
        pq.offer(0);
        return pq.poll();
    }
}
