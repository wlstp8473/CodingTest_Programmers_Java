// 특정 문자 기준으로 문자열 분리 => split("") 메서드 활용 (반환 값은 배열)
class Solution {
    public String[] solution(String my_string) {
        return my_string.split(" ");
    }
}

//직접 구현
/*
import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        List<String> list = new ArrayList<>();
        String word = "";
        
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            
            if (c == ' ') {
                list.add(word);
                word = "";
            } else {
                word += c;
            }
        }
        list.add(word); 
        return list.toArray(new String[0]);
    }
}
*/