class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> st = new Stack<>();
        int n = temp.length;
        int ans[] = new int[n];
        int idx = n-1;
        for(int i = n-1;i>=0;i--){
            while(!st.isEmpty() && temp[i] >= temp[st.peek()]){
                st.pop();
            }
            ans[idx--] = (st.isEmpty() ? 0 :st.peek()-i );
            st.push(i);
        }
        return ans;
    }
}
