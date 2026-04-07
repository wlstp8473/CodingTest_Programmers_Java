/*
문자열에 "cafelatte" 있으면 라떼
나머지는 전부 아메리카노
*/

class Solution {
    public int solution(String[] order) {
        int sum = 0;
        
        for(String o : order){
            if(o.contains("cafelatte")){
                sum += 5000;
            }
            else{
                sum += 4500;
            }
        }
        return sum;
    }
}