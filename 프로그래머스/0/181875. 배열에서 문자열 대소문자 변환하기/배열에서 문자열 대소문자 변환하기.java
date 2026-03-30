class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        
        for(int i = 0; i < strArr.length; i++){
            if(i % 2 == 0){
                answer[i] = strArr[i].toLowerCase();
            }
            else{
                answer[i] = strArr[i].toUpperCase();
            }
        }
        return answer;
    }
}
/*
//배열 생성 없이 풀어보기

class Solution {
    public String[] solution(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = (i % 2 == 0)
                    ? strArr[i].toLowerCase()
                    : strArr[i].toUpperCase();
        }
        return strArr;
    }
}
*/
