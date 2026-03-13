// 문자열.contains("특정키워드")

import java.util.*;
    
class Solution {
    public String[] solution(String[] strArr) {
        List<String> list = new ArrayList<>();
        
        for(String str : strArr){
            if(!str.contains("ad")){
                list.add(str);
            }
        }
        return list.toArray(new String[0]);
    }
}