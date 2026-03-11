/*
"숫자 연산자 숫자 연산자 숫자" 구조
수식 계산은 항상 첫 숫자부터 시작 => answer에 첫 숫자 저장 후
연산자만 반복문으로 처리 (i += 2, 만약 i++하게 되면 불필요한 반복 발생)

*/

class Solution {
    public int solution(String my_string) {
        String[] arr = my_string.split(" ");
        int answer = Integer.parseInt(arr[0]);
        for(int i = 1; i < arr.length; i += 2){
            if(arr[i].equals("+")){
                answer += Integer.parseInt(arr[i + 1]);
            }
            else{
                answer -= Integer.parseInt(arr[i + 1]);
            }
        }
        return answer;
    }
}
