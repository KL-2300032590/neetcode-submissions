class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for (String i : tokens) {

            if (i.equals("+") || i.equals("-") ||
                i.equals("*") || i.equals("/")) {

                int b = st.pop();
                int a = st.pop();

                int r = 0;

                if (i.equals("+")) {
                    r = a + b;
                } else if (i.equals("-")) {
                    r = a - b;
                } else if (i.equals("*")) {
                    r = a * b;
                } else {
                    r = a / b;
                }

                st.push(r);

            } else {
                st.push(Integer.parseInt(i));
            }
        }

        return st.pop();
    }
}