/*
풀이 아이디어
"1" => mode 변경 (모드에 따라 짝수/홀수 인덱스 문자만 추가)
*/

class Solution {
    public String solution(String code) {
        int mode = 0;
        StringBuilder ret = new StringBuilder();
        
        //"1"일 때, mode 변경
        for(int i = 0; i < code.length(); i++){
            char ch = code.charAt(i);
            
            if(ch == '1'){
                mode = 1 - mode;
                continue;
            }
            
            //mode = 0
            if(mode == 0){
                if(i % 2 == 0){
                    ret.append(ch);
                }
            }
            //mode = 1
            else{ 
                if(i % 2 == 1){
                    ret.append(ch);
                }
            }
        }
        
        if(ret.length() == 0){
            return "EMPTY";
        }
        return ret.toString();
    }
}