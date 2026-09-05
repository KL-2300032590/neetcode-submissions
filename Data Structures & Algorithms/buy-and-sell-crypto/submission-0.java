class Solution {
    public int maxProfit(int[] a) {
        int buy = a[0];
        int profit = 0;
        for(int i =0;i<a.length;i++){
            if(a[i]>buy){
                profit = Math.max(profit,a[i]-buy);
            }
            buy = Math.min(buy,a[i]);
        }
        return profit;
    }
}
