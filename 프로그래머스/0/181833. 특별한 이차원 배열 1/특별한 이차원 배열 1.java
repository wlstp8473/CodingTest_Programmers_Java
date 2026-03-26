/*
단위 행렬 만들기
arr[i][j]에서   i == j => 1
                i != j => 0

일반 풀이: O(n²)
최적화 풀이: O(n)               
*/

//단순 반복
class Solution {
    public int[][] solution(int n) {
        int[][] arr = new int[n][n];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j){
                    arr[i][j] = 1;
                }
                else{
                    arr[i][j] = 0;
                }
            }
        }
        return arr;
    }
}

// 최적화 로직 (모근값을 검사할 필요 없음, 배열의 초기값은 0이기 때문)
/*
class Solution {
    public int[][] solution(int n) {
        int[][] arr = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            arr[i][i] = 1;
        }
        
        return arr;
    }
}
*/