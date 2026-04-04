/*
문자열을 3부분으로 나누기, [앞] + [뒤집을 부분] + [뒤]
substring(s, e + 1) → e 포함하려면 +1 필요
StringBuilder.reverse() 활용
*/
class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder();
        
        //앞부분
        sb.append(my_string.substring(0, s));
        
        //뒤집을 부분
        StringBuilder mid = new StringBuilder(my_string.substring(s, e + 1));
        sb.append(mid.reverse());
        
        //뒷부분
        sb.append(my_string.substring(e+1));
        
        return sb.toString();
    }
}


/*
//Char 배열 직접 뒤집기
class Solution {
    public String solution(String my_string, int s, int e) {
        char[] arr = my_string.toCharArray();
        
        while(s < e){
            char temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        return new String(arr);
    }
}
*/