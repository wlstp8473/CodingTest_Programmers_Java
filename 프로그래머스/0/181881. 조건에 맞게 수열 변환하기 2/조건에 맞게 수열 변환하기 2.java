/*
풀이 아이디어
50 이상이면서 짝수 → 2로 나눔
50 미만이면서 홀수 → 2를 곱하고 1 더함
그 외 → 그대로

이걸 배열 전체에 적용한 뒤,
이전 배열과 새 배열이 같으면 종료
아니면 계속 반복 (반복횟수 반환)
*/

class Solution {
    public int solution(int[] arr) {
        int count = 0;
        
        while(true){
            boolean changed = false;
            
            for(int i = 0; i < arr.length; i++){
                int prev = arr[i];
                
                if(arr[i] >= 50 && arr[i] % 2 == 0){
                    arr[i] /= 2;
                }
                else if(arr[i] < 50 && arr[i] % 2 == 1){
                    arr[i] = arr[i] * 2 + 1;
                }
                
                if(arr[i] != prev){
                    changed = true;
                }
            }
            if(!changed){
                return count;
            }
            count++;
        }
    }
}