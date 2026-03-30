class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        
        for(char c : myString.toCharArray()){
            if(c == 'a'){
                sb.append('A');
            }
            else if(c > 'A' && c <= 'Z'){
                sb.append(Character.toLowerCase(c));
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

/*
//더 간단한 풀이 (toLowerCase 활용)
//전체 소문자로 변경 -> 'a'만 'A'로 바꾸기

class Solution {
    public String solution(String myString) {
        String lower = myString.toLowerCase(); // 전부 소문자로
        
        StringBuilder sb = new StringBuilder();
        for (char c : lower.toCharArray()) {
            if (c == 'a') sb.append('A');
            else sb.append(c);
        }
        
        return sb.toString();
    }
}
*/