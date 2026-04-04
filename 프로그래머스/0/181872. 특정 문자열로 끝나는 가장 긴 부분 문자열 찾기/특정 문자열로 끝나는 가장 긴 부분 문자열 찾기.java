/*
pat가 마지막으로 시작하는 위치 찾기
그 위치에 pat.length()를 더한 지점까지 자르기
*/

class Solution {
    public String solution(String myString, String pat) {
        int idx = myString.lastIndexOf(pat);
        return myString.substring(0, idx + pat.length());
    }
}


/*
//직접 찾기
class Solution {
    public String solution(String myString, String pat) {
        int last = 0;

        for (int i = 0; i <= myString.length() - pat.length(); i++) {
            if (myString.substring(i, i + pat.length()).equals(pat)) {
                last = i;
            }
        }

        return myString.substring(0, last + pat.length());
    }
}
*/