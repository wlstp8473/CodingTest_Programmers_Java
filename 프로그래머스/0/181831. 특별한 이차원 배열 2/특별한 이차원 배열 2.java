/*
대칭 핼렮 판별 문제
arr[i][j] == arr[j][i]

시간복잡도:
기본: O(n²)
최적화: O(n² / 2) → 여전히 O(n²)이지만 더 빠름 (절반만 비교 (j = i+1))
*/

//단순 반복(이중)
class Solution {
    public int solution(int[][] arr) {
        int n = arr.length;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(arr[i][j] != arr[j][i]){
                    return 0;
                }
            }
        }
        return 1;
    }
}

//최적화 로직, (i, j)와 (j, i) 비교는 한쪽만 해도 충분하기 때문
/*
class Solution {
    public int solution(int[][] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i][j] != arr[j][i]) {
                    return 0;
                }
            }
        }
        return 1;
    }
}
*/