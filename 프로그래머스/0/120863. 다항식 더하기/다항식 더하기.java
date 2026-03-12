/*
동류항 끼리 나눠서 계산 후, 문자열 변환

olynomial.split(" \\+ ")
+가 정규식에서 특별한 의미를 가지기 때문에 \\+로 이스케이프 명시해야
문자열을 " + " 기준으로 나눌 수 있음
*/  
    
class Solution {
    public String solution(String polynomial) {
        String[] arr = polynomial.split(" \\+ ");
        
        int xSum = 0;
        int numSum = 0;
        
        for(String s : arr){
            if(s.contains("x")){
                if(s.equals("x")){
                    xSum += 1;
                }
                else{
                    xSum += Integer.parseInt(s.replace("x",""));
                     }
            }
            else{
                numSum += Integer.parseInt(s);
            }
        }
        if(xSum == 0){
            return String.valueOf(numSum);
        }
        if(numSum == 0){
            if(xSum == 1) return "x";
            return xSum + "x";
        }
        if(xSum == 1){
            return "x + " + numSum;
        }
        return xSum + "x + " + numSum;
    }
}