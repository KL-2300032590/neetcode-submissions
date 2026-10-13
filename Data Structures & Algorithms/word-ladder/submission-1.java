class Pair{
    String s;
    int dist;
    Pair(String s,int dist){
        this.s = s;
        this.dist = dist;
    }
}
class Solution {
    public int ladderLength(String st, String end, List<String> wordList) {
        Set<String> hs = new HashSet<>(wordList);
        Queue<Pair> q = new LinkedList<>();
        if(!hs.contains(end))return 0;

        q.offer(new Pair(st,1));
        hs.remove(st);
        while(!q.isEmpty()){
            Pair cur = q.poll();
            String s = cur.s;
            int dist = cur.dist;
            if(s.equals(end))return dist;
            char arr[] = s.toCharArray();
            for(int i = 0;i<s.length();i++){
                char org = arr[i];
                for(char ch = 'a' ; ch <='z';ch++){
                    arr[i] = ch;
                    String t = new String(arr);
                    if(hs.contains(t)){
                        hs.remove(t);
                        q.offer(new Pair(t,dist+1));
                    }
                }
                arr[i] = org;
            }
        }
        return 0;
    }
}
