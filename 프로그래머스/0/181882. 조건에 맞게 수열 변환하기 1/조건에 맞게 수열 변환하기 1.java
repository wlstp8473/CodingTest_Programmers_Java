/*
풀이 아이디어
1. x >= 50 && x % 2 == 0 → x / 2
2. x < 50 && x % 2 == 1 → x * 2

*/
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++){
            int x = arr[i];
            
            if(x >= 50 && x % 2 == 0){
                answer[i] = x / 2;
            }
            else if(x < 50 && x % 2 == 1){
                answer[i] = x * 2;
            }
            else{
                answer[i] = x;
            }
        }
        return answer;
    }
}

/*
//성능을 고려한 비트연산 (가독성이 떨어짐)

class Solution {
    public int[] solution(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            
            if (x >= 50 && (x & 1) == 0) { // 짝수
                arr[i] = x >> 1; // 나누기 2
            } else if (x < 50 && (x & 1) == 1) { // 홀수
                arr[i] = x << 1; // 곱하기 2
            }
        }
        
        return arr;
    }
}



*/