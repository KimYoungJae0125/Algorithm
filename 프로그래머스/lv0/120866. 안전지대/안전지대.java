class Solution {
    public int solution(int[][] board) {
        int[][] safeties = new int[board.length][board[0].length];
        int answer[] = {board.length * board[0].length};
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(board[i][j] == 1) {
                    dangerous(safeties, true, i, j, answer);                 //가운데

                    if(i != 0) {
                        dangerous(safeties, true, i-1, j, answer);        //왼쪽
                        dangerous(safeties,  j!=0, i-1, j-1, answer);  //왼쪽 위 대각선
                        dangerous(safeties,  j!=0, i, j-1, answer);       //위
                    }

                    if(i < board.length - 1) {
                        dangerous(safeties, true, i+1, j, answer);        //아래
                        dangerous(safeties, j!=0, i+1, j-1, answer);   //왼쪽 아래 대각선

                    }
                    if(j < board[0].length-1) {
                        dangerous(safeties, true, i, j+1, answer);                      //오른쪽
                        dangerous(safeties, i!=0, i-1, j+1, answer);                 //오른쪽 위 대각선
                        dangerous(safeties, i<board.length-1, i+1, j+1, answer);      //오른쪽 아래 대각선
                    }
                }
            }
        }
        return answer[0];
    }
    private void dangerous(int[][] safeties, boolean predicate, int i, int j, int[] answer) {
        if(predicate && safeties[i][j] != 1) {
            safeties[i][j] = 1;
            answer[0]--;
        }
    }
}