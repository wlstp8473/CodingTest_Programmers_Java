//i % q == r 을 만족하는 인덱스만 문자열에 추가

class Solution {
    public String solution(int q, int r, String code) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < code.length(); i++){
            if(i % q == r){
                sb.append(code.charAt(i));
            }
        }
        return sb.toString();
    }
}