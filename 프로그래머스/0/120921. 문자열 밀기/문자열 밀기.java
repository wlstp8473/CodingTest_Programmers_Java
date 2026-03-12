//문자열 밀기 = 마지막 문자 + 나머지 문자열
class Solution {
    public int solution(String A, String B) {
        for(int i = 0; i < A.length(); i++){
            if(A.equals(B)){
                return i;
            }
            A = A.charAt(A.length()-1) + A.substring(0, A.length() - 1);
        }
        return -1;
    }
}