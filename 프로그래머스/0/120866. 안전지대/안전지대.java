/*
1. 지뢰 위치 찾기 (board[i][j] == 1)
2. 지뢰 주변 8칸을 위험지역으로 표시
3. 마지막에 0 개수 세기

(-1,-1) (-1,0) (-1,1)
(0,-1)   지뢰  (0,1)
(1,-1)  (1,0) (1,1)

*/
class Solution {
    public int solution(int[][] board) {
        int n = board.length;
        int[][] danger = new int[n][n];
        
        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1}; //8방향
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j <n; j++){
                if(board[i][j] == 1) //지뢰 찾기
                {
                    danger[i][j] = 1;
                    for(int k = 0; k < 8; k++)
                    {
                        int nx = i + dx[k];
                        int ny = j + dy[k];
                        
                        //배열 범위 체크
                        if(nx >= 0 && ny >= 0 && nx < n && ny < n)
                        {
                            danger[nx][ny] = 1; //위험 지역 표시
                        }
                    }
                }
            }
        }
        int count = 0;
        
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(danger[i][j] == 0)
                {
                    count++;
                }
            }
        }
        return count++;
    }
}