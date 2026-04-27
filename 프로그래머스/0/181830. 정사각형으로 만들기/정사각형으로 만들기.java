//자바 int 배열의 기본값은 0 => 기존 값만 복사해서 정사각형 배열 만들기

class Solution {
    public int[][] solution(int[][] arr) {
        int row = arr.length; //행 개수
        int col = arr[0].length; //열 개수
        
        //정사각형 배열 생성 (큰 값 기준)
        int size = Math.max(row, col);
        int[][] answer = new int[size][size];
        
        //기존 값 복사
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                answer[i][j] = arr[i][j];
            }
        }
        return answer;
    }
}