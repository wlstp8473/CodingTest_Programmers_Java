/*
<풀이 아이디어>
각 쿼리 [s, e, k]에 대해:
s부터 e까지 순회
arr[i] > k인 값만 후보
그중 가장 작은 값을 갱신
*/
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        int[] answer = new int[queries.length];
        
        for(int q = 0; q < queries.length; q++){
            int s = queries[q][0];
            int e = queries[q][1];
            int k = queries[q][2];
            
            int minValue = Integer.MAX_VALUE;
            //가장 작은 값”을 모르니까, int가 가질 수 있는 최대값으로 시작해서 최솟값 검증
            
            for(int i = s; i <= e; i++){
                if(arr[i] > k){
                    minValue = Math.min(minValue, arr[i]);
                }
            }
            
            if(minValue == Integer.MAX_VALUE){
                answer[q] = -1;
            }
            else{
                answer[q] = minValue; 
            }
        }
        return answer;
    }
}