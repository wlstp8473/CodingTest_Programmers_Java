/*
선택 위치 = (i * m) + (c - 1)
i = 행 번호 (0부터)
c- 1 = 열의 위치 (0-based)
*/
class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = c - 1; i < my_string.length(); i += m){
            sb.append(my_string.charAt(i));
        }
        return sb.toString();
    }
}

/*
//2차원 활용
class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder sb = new StringBuilder();
        int rows = my_string.length() / m;
        
        for (int i = 0; i < rows; i++) {
            sb.append(my_string.charAt(i * m + (c - 1)));
        }
        
        return sb.toString();
    }
}
*/