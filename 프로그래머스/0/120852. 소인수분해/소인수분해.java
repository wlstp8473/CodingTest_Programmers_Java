import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 2; i <= n; i++){
            if(n % i == 0){
                list.add(i);
                
                while(n % i == 0)
                {
                    n = n / i; //n을 i로 계속 나누어 같은 소인수 제거
                }
            }
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}