class KthLargest {
    PriorityQueue<Integer> pq ;
    int k ;
    public KthLargest(int k, int[] arr) {
        pq = new PriorityQueue<>();
        this.k = k;
        for(int i = 0;i<arr.length;i++){
            pq.offer(arr[i]);
            while(pq.size() > k){
                pq.poll();
            }
        }

    }
    
    public int add(int val) {
        pq.offer(val);
        if(pq.size() >k){
            pq.poll();
        }
        return pq.peek();
    }
}
