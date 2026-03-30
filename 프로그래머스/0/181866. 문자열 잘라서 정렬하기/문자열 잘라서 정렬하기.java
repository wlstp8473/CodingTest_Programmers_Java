/*
1. "x"를 기준으로 문자열 자르기
2. 빈 문자열 제거
3. 사전순으로 정렬
*/
import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] arr = myString.split("x");
        
        //빈 문자열 제거
        List<String> list = new ArrayList<>();
        for(String s : arr){
            if(!s.isEmpty()){
                list.add(s);
            }
        }
        
        //사전 순 정렬
        Collections.sort(list);
        
        //배열로 변환 후 반환
        return list.toArray(new String[0]);
    }
}