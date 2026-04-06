
//문자의 길이별 빈도수 체크(문자의 길이가 명확 => 배열 사용)

class Solution {
    public int solution(String[] strArr) {
        int[] count = new int[31]; //문자열의 최대 길이는 30이니
        int max = 0;
        
        for(String str: strArr){
            int len = str.length();
            count[len]++;
            max = Math.max(max, count[len]);
        }
        return max;
    }
}

/*
//문자의 길이 제한이 없을 떄, 일반적인 풀이
//map.get(len) + 1 // key 없으면 NullPointerException 발생 주의
//map.getOrDefault(len, 0) 활용


import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        
        for (String str : strArr) {
            int len = str.length();
            map.put(len, map.getOrDefault(len, 0) + 1);//예외처리 후, 값 증가
            max = Math.max(max, map.get(len));
        }
        
        return max;
    }
}
*/