/*
"x"를 기준으로 문자열을 나눈다
나눠진 각 문자열의 길이를 배열에 담는다
빈 문자열("")도 포함해야 함

split("x", -1): 두 번째 값에 -1 적용 시, 빈 문자열까지 모두 유지
str.split("x") == str.split("x", 0): 뒤 쪽 빈 문자열 제거
str.split("x", 양수): 최대 양수개 가지만 자름, 마지막 요소에 나머지 문자열이 다 들어감 
*/
class Solution {
    public int[] solution(String myString) {
        String[] arr = myString.split("x", -1);
        int[] answer = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++){
            answer[i] = arr[i].length();
        }
        return answer;
    }
}