class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        func(0,nums,target,new ArrayList<>(),ans);
        return ans;
    }
    public void func(int i,int a[],int t,List<Integer> ls,List<List<Integer>> ans){
        if(i==a.length){
            if(t==0){
                ans.add(new ArrayList<>(ls));
                return;
            }
        }

        if(t<0 || i>=a.length)return;

        ls.add(a[i]);
        func(i,a,t-a[i],ls,ans);
        ls.remove(ls.size()-1);
        func(i+1,a,t,ls,ans);
    }
}
