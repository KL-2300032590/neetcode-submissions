class Solution {
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                if(board[i][j] == word.charAt(0)){
                    if(dfs(0,i,j,board,word)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean dfs(int idx,int i,int j,char board[][],String s){
        if (idx == s.length()) return true;

        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != s.charAt(idx)) {
            return false;
        }

        char t = board[i][j];
        board[i][j] = ' ';
        boolean ans =  dfs(idx+1,i+1,j,board,s) ||
        dfs(idx+1,i,j+1,board,s) ||
        dfs(idx+1,i-1,j,board,s)||
        dfs(idx+1,i,j-1,board,s);
        board[i][j] = t;
        return ans;
    }
}
