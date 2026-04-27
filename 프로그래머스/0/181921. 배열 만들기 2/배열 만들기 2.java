/*
<풀이 아이디어>
l부터 r까지 모든 수를 확인하면서, 각 숫자가 0과 5로만 이루어졌는지 검사
r이 최대 1,000,000이라서 완전탐색으로도 충분
*/
import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        
        for(int num = l; num <= r; num++){
            if(isValid(num)){
                list.add(num);
            }
        }
        
        if(list.isEmpty()){
            return new int[]{-1};
        }
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
    
    public boolean isValid(int num){
        while(num > 0){
            int digit = num % 10;
            
            if(digit != 0 && digit != 5){
                return false;
            }
            num /= 10;
        }
        return true;
    }
}