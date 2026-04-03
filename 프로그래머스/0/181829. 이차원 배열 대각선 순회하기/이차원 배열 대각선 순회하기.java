/*
행 i 순회
열 j 순회
i + j <= k 를 만족하면, board[i][j] 더하기
*/

class Solution {
    public int solution(int[][] board, int k) {
        int sum = 0;
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(i + j <= k){
                    sum += board[i][j];
                }
            }
        }
        return sum;
    }
}

/*
//조건 범위 지정

class Solution {
    public int solution(int[][] board, int k) {
        int sum = 0;
        int rows = board.length;
        int cols = board[0].length;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols && i + j <= k; j++) {
                sum += board[i][j];
            }
        }
        
        return sum;
    }
}
*/