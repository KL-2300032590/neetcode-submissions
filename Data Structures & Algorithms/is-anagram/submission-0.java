class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        int f[] = new int[256];
        for(char ch : s.toCharArray()){
            f[ch]++;
        }
        for(char ch : t.toCharArray()){
            f[ch]--;
        }

        for(int i =0;i<256;i++){
            if(f[i]!=0)return false;
        }
        return true;
    }
}
