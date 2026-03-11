//정렬 비교
import java.util.Arrays;

class Solution {
    public int solution(String[] spell, String[] dic) {
        Arrays.sort(spell);
        String target = String.join("", spell);
        
        for(String word : dic){
            String[] arr = word.split("");
            Arrays.sort(arr);
            
            String sortedWord = String.join("", arr);
            
            if(target.equals(sortedWord)){
                return 1;
            }
        }
        return 2;
    }
}

//contains 방식
/*
class Solution {
    public int solution(String[] spell, String[] dic) {
        
        for (String word : dic) {
            
            if (word.length() != spell.length) continue;
            
            boolean flag = true;
            
            for (String s : spell) {
                if (!word.contains(s)) {
                    flag = false;
                    break;
                }
            }
            
            if (flag) return 1;
        }
        
        return 2;
    }
}
*/