/*
<풀이 아이디어>
picture의 각 문자열에 대해
문자열의 각 문자를 하나씩 확인
그 문자를 k번 반복해서 새 문자열 생성
완성된 새 문자열을 결과에 k번 추가
*/
import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        List<String> list = new ArrayList<>();
        
        //picture 각 줄을 순회
        for(String line : picture){
            StringBuilder sb = new StringBuilder();
            
            //현재 줄의 각 문자를 가로로 k배 확대
            for(int i = 0; i < line.length(); i++){
                char ch = line.charAt(i);
                
                for(int j = 0; j < k; j++){
                    sb.append(ch);
                }
            }
            
            //세로로 k번 추가
            String enlargedLine = sb.toString();
            for(int i = 0; i < k; i++){
                list.add(enlargedLine);
            }
        }
        return list.toArray(new String[0]);
    }
}