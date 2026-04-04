/*
contains() / split() 쓰면 안됨 x (겹치는 패턴을 못 셈)

문자열을 한 칸씩 이동하면서, 아래 부분이 pat과 같은지 비교
myString[i ~ i+pat.length] 
*/

class Solution {
    public int solution(String myString, String pat) {
        int count = 0;
        
        for(int i = 0; i <= myString.length() - pat.length(); i++)
        {
            if(myString.substring(i, i + pat.length()).equals(pat)){
                count++;
            }
        }
        return count;
    }
}


/*
//더 빠른 방식 (char 비교)

class Solution {
    public int solution(String myString, String pat) {
        int count = 0;
        int len = pat.length();
        
        for(int i = 0; i <= myString.length() - len; i++){
            boolean match = true;
            
            for(int j = 0; j < len; j++){
                if(myString.charAt(i + j) != pat(charAt(j)){
                    match = false;
                    break;
                }
            }
                   if(match) count++;
        }
                   return count;
    }
}
*/