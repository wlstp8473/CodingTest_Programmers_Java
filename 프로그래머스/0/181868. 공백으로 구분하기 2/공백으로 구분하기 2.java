/*
공백 여러 개 문제 = trim() + split("\\s+")

str.trim() 문자열 앞 뒤 공백 제거
//split("\\s+") 모든 공백(스페이스, 탭)를 기준으로 나눔
*/

class Solution {
    public String[] solution(String my_string) {
        return my_string.trim().split("\\s+");
    }
}