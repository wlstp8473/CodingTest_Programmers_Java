/*
어떤 수 % 9 = (각 자리 숫자의 합) % 9

number 길이 최대 100,000
int, long으로 못 담음
문자열 그대로 처리해야 함
(문자열의 각 자리를 더해, 마지막에 % 9 수행)
*/

class Solution {
    public int solution(String number) {
        int sum = 0;
        
        for(char c : number.toCharArray()){
            sum += c - '0'; //문자->숫자 변환
        }
        return sum % 9;
    }
}