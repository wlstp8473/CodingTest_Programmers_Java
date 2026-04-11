/*
<풀이 아이디어>
1. 뒤에서 부터 한 자리씩 더하기 (문자열이니 , 뒤에서부터 접근)
2. 자리 올림 처리 (sum = (a의 자리 숫자) + (b의 자리 숫자) + carry)
3. 길이가 다른 경우 처리 (없는 부분은 0으로 처리)
4. 결과는 뒤집어서 다른 경우 처리
*/

class Solution {
    public String solution(String a, String b) {
        StringBuilder sb = new StringBuilder();
        
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        
        while(i >= 0 || j >= 0 || carry > 0){
            int sum = carry;
            
            if( i >= 0){
                sum += a.charAt(i) - '0';
                i--;
            }
            if(j >= 0){
                sum += b.charAt(j) - '0';
                j--;
            }
            
            sb.append(sum % 10); //현재 자리
            carry = sum / 10; //자리 올림
            
        }
        return sb.reverse().toString();
    }
}