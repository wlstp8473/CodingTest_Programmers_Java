/* 
<풀이 아이디어>
각 query가 [s, e, k] 이므로
i를 s부터 e까지 돌면서, i % k == 0 이면 arr[i]++ 수행

k = 0이면 k % 0은 따로 처리

k = 0일 때
인덱스 중에서 0의 배수라고 볼 수 있는 건 이 문제에서는 0만 가능
즉, s <= 0 <= e일 때만 arr[0]++
*/  
    

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int[] q : queries){
            int s = q[0];
            int e = q[1];
            int k = q[2];
            
            if(k == 0){
                if(s == 0){
                    arr[0]++;
                }
            }
            else{
                for(int i = s; i <= e; i++){
                    if(i % k == 0){
                        arr[i]++;
                    }
                }
            }
        }
        return arr;
    }
}