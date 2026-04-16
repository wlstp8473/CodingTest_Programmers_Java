/*
<풀이 아이디어>
배열을 진짜로 자르는 게 아니라, 남아 있는 구간의 시작과 끝만 계속 바꾸는 문제임
*/

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int start = 0;
        int end = arr.length - 1;
        
        for(int i = 0; i < query.length; i++){
            if(i % 2 == 0){
                //짝수 인덱스일 땐 뒤에를 자름
                end = start +query[i];
            }
            else{
                //홀수 인덱스일 땐, 앞에 짜름
                start = start + query[i];
            }
        }
        int[] answer = new int[end - start + 1];
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = arr[start + i];
        }
        return answer;
    }
}