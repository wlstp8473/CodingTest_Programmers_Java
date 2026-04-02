/*
umLog[i]는 이전 값 numLog[i-1]에서 한 번 조작한 결과
따라서 매번 두 값의 차이를 구하면 어떤 문자를 눌렀는지 알 수 있음

i = 1부터 끝까지 순회
numLog[i] - numLog[i-1] 계산
차이에 맞는 문자 붙이기
*/

class Solution {
    public String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 1; i < numLog.length; i++){
            int diff = numLog[i] - numLog[i - 1];
            
            if(diff == 1){
                sb.append("w");
            }
            else if(diff == -1){
                sb.append("s");
            }
            else if(diff == 10){
                sb.append("d");
            }
            else if(diff == -10){
                sb.append("a");
            }
        }
        return sb.toString();
    }
}