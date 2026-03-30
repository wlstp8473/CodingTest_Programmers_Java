//내장 함수 활용 toLowerCase()
class Solution {
    public String solution(String myString) {
        return myString.toLowerCase();
    }
}

/*
//ASCII를 활용하여, 직접 구현
//핵심 풀이: 대문자 + 32 = 소문자

class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();

        for (char c : myString.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                sb.append((char)(c + 32)); // 대문자 → 소문자
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
*/