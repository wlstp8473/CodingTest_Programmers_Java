
/*
구분자(a,b,c) → 저장 & 초기화
일반 문자 → 이어붙이기
*/

import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        
        for (char c : myStr.toCharArray()) {
            if (c == 'a' || c == 'b' || c == 'c') {
                if (sb.length() > 0) {
                    list.add(sb.toString());
                    sb.setLength(0); // 초기화
                }
            }
            else{
                sb.append(c);
            }
        }
        // 마지막 남은 문자열 처리(구분자로 끝나지 않는 케이스)
        if (sb.length() > 0) {
            list.add(sb.toString());
        }
        
        // 결과가 없으면 ["EMPTY"]
        if (list.isEmpty()) {
            return new String[]{"EMPTY"};
        }
        return list.toArray(new String[0]);
    }
}

/*
//split 풀이
//단순하지만, 시간 복잡도 O(n) (최대 1,000,000 → 중요!)

class Solution {
    public String[] solution(String myStr) {
        String[] arr = myStr.split("[abc]");
        List<String> list = new ArrayList<>();

        for (String s : arr) {
            if (!s.isEmpty()) list.add(s);
        }

        if (list.isEmpty()) return new String[]{"EMPTY"};

        return list.toArray(new String[0]);
    }
}


*/