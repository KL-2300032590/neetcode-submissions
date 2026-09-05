class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s : strs){
            sb.append(s).append("₹");
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> ls = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<str.length();i++){
            if(str.charAt(i) == '₹'){
                ls.add(sb.toString());
                sb.setLength(0);
                continue;
            }
            sb.append(str.charAt(i));
        }
        return ls;
    }
}
