/*
<풀이 아이디어>
결과 배열 answer를 크기 k로 만든다
처음엔 전부 -1로 채운다
arr를 앞에서부터 순회하면서
처음 등장한 값만 answer에 넣는다 (중복 없애기)
k개 채우면 종료
*/
import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        
        //배열 -1로 초기화
        Arrays.fill(answer, -1);
        
        //중복 체크용 Set
        Set<Integer> set = new HashSet<>();
        
        int idx = 0;
        
        for(int num : arr){
            //이미 중복된 값이면 pass
            if(set.contains(num)) continue;
            
            //처음 나온 값이니 ,추가
            set.add(num); 
            answer[idx++] = num;
            
            // k개 채우면 종료
            if(idx == k) break;
        }
        return answer;
    }
}