//인덱스를 5씩 증가시키면서 첫 번째만 뽑기

import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        List<String> result = new ArrayList<>();
        
        for(int i = 0; i < names.length; i += 5)
        {
            result.add(names[i]);
        }
        return result.toArray(new String[0]);
    }
}