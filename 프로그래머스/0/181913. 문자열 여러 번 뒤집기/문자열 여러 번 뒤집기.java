/*
풀이 아이디어
문자열의 특정 구간을 여러 번 뒤집는 문제
문자열은 immutable 하므로 직접 수정 X
char[] 활용해서, s~e 구간을 뒤집을 것임 (swap)

왼쪽(s) ↔ 오른쪽(e) swap
→ s++, e--
→ 반복
*/

class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] arr = my_string.toCharArray();
        
        for(int[] q : queries){
            int s = q[0];
            int e = q[1];
            
            while(s < e){
                char temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;              
                s++;
                e--;
            }
        }
        return new String(arr);
    }
}

/*
//StringBuilder는 문자열 수정 가능
//특정 구간만 잘라서 reverse() 사용

class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder(my_string);

        for (int[] q : queries) {
            int s = q[0];
            int e = q[1];

            String sub = sb.substring(s, e + 1);
            String reversed = new StringBuilder(sub).reverse().toString();

            sb.replace(s, e + 1, reversed);
        }

        return sb.toString();
    }
}


*/