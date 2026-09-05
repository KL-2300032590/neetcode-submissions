class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> ans = new HashMap<>();
        for(String s : strs){
            int cnt[] = new int[26];
            for(char ch : s.toCharArray()){
                cnt[ch-'a']++;
            }
            String k = Arrays.toString(cnt);
            ans.putIfAbsent(k,new ArrayList<>());
            ans.get(k).add(s);
        }
        return new ArrayList<>(ans.values());
    }
}
