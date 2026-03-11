/*
이진수 문자열 → 정수로 변환 → 더하기 → 다시 이진수 문자열로 변환

Integer.parseInt(문자열, 2) → 2진수를 10진수로 변환
Integer.toBinaryString(숫자) → 10진수를 2진수 문자열로 변환
*/

class Solution {
    public String solution(String bin1, String bin2) {
        int num1 = Integer.parseInt(bin1, 2);
        int num2 = Integer.parseInt(bin2, 2);
        
        int sum = num1 + num2;
        
        return Integer.toBinaryString(sum);
    }
}