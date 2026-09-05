class Solution {
    public int characterReplacement(String s, int k) {
        Set<Character> hs = new HashSet<>();
        for(char ch : s.toCharArray()){
            hs.add(ch);
        }

        int ans=0;
        for(char c : hs){
            int cnt=0,l=0;
            for(int r =0;r<s.length();r++){
                if(s.charAt(r)==c){
                    cnt++;
                }
                while((r-l+1)-cnt >k){
                    if(s.charAt(l)==c){
                        cnt--;
                    }
                    l++;
                }
                ans = Math.max(ans,r-l+1);
            }
        }
        return ans;

    }
}
