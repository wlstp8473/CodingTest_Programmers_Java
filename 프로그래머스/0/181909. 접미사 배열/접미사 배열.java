import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        int n = my_string.length();
        String[] answer = new String[n];
        
        //접미사 생성
        for(int i = 0; i < n; i++){
            answer[i] = my_string.substring(i);
        }
        
        //정렬
        Arrays.sort(answer);
        
        return answer;
    }
}

/*
//리스트 활용 풀이

import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        List<String> list = new ArrayList<>();
        
        for (int i = 0; i < my_string.length(); i++) {
            list.add(my_string.substring(i));
        }
        
        Collections.sort(list);
        
        return list.toArray(new String[0]);
    }
}
*/