class Solution {
    public int carFleet(int target, int[] pos, int[] speed) {
        int n = pos.length;
        int arr[][] = new int[n][2];
        for(int i = 0;i<n;i++){
            arr[i][0] = pos[i];
            arr[i][1] = speed[i];
        }
        Arrays.sort(arr,(a,b)->Integer.compare(b[0],a[0]));
        int fleet = 1;
        double time = (double)(target - arr[0][0])/arr[0][1];
        for(int i = 1;i<n;i++){
            double x = (double)(target - arr[i][0])/arr[i][1];
            if(x > time){
                fleet++;
                time = x;
            }
        }
        return fleet;
    }
}
