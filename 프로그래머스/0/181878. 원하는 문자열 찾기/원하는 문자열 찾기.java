/*
풀이 아이디어
1. 대소문자 통일 -> toLowerCase() or toUpperCase()
2. 포함여부 확인 -> contains()
3. 있으면 1, 없으면 0 반환
*/

class Solution {
    public int solution(String myString, String pat) {
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();
        
        return myString.contains(pat) ? 1 : 0;
       
        //인덱스 위치까지 반환하려면
        //return myString.indexOf(pat) != -1 ? 1 : 0;
    }
}

/*
//직접 구현 (슬라이딩 윈도우 활용)
class Solution {
    public int solution(String myString, String pat) {
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();

        int n = myString.length();
        int m = pat.length();

        for (int i = 0; i <= n - m; i++) {
            if (myString.substring(i, i + m).equals(pat)) {
                return 1;
            }
        }
        return 0;
    }
}
*/