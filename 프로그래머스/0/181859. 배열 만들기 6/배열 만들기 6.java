/*
<풀이 아이디어>
stk가 비어있으면 → push
stk 마지막 == 현재값 → pop
stk 마지막 != 현재값 → push
*/
import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        
        for(int num : arr){
            if(stk.isEmpty()){
                stk.add(num);
            }
            else{
                if(stk.get(stk.size() - 1) == num){
                    stk.remove(stk.size()-1); //pop
                }
                else{
                        stk.add(num); //push
                }
            }
        }
            
            if(stk.isEmpty()){
                return new int[]{-1};
            }
            
            return stk.stream()
                .mapToInt(i -> i)
                .toArray();
    }
}