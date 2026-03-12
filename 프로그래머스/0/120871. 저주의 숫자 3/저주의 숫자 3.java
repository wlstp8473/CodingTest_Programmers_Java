/*
아래 조건은 건너뜀

num % 3 == 0      (3의 배수)
String.valueOf(num).contains("3")  (3이 포함된 숫자)
*/

class Solution {
    public int solution(int n) {
        int num = 0;
        int count = 0;
        
        while(count < n){
            num++;
            
            if(num% 3 == 0 || String.valueOf(num).contains("3")){
                continue;
            }
            count++;
        }
        return num;
    }
}