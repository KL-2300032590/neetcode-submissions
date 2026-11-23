class Solution {
    public int largestRectangleArea(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int ans =0 ;
        for(int i = 0;i < n;i++){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                int h = arr[st.pop()];
                int w = i- ((st.isEmpty())?-1 : st.peek())-1 ;
                ans = Math.max(ans, h * w);
            }
            st.push(i);
        }

        while(!st.isEmpty()){
            int h = arr[st.pop()];
            int w = n - ((st.isEmpty()? -1 : st.peek()))-1;
            ans = Math.max(ans, h * w);
        }
        return ans;
    }
}
