class Solution {
    public int maxArea(int[] a) {
        int l =0,h = a.length-1;
        int ans=0;
        while(l<h){
            int area = Math.min(a[l],a[h])*(h-l);
            ans= Math.max(ans,area);
            if(a[l] <= a[h]){
                l++;
            }else{
                h--;
            }
        }
        return ans;
    }
}
