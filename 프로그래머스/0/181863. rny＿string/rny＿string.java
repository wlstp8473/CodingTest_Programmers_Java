//문자열 치환, replace() 메소드 활용
class Solution {
    public String solution(String rny_string) {
        return rny_string.replace("m", "rn");
    }
}


//반복문 활용
/*
class Solution {
    public String solution(String rny_string) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < rny_string.length(); i++) {
            char c = rny_string.charAt(i);
            
            if (c == 'm') {
                sb.append("rn");
            } else {
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}
*/