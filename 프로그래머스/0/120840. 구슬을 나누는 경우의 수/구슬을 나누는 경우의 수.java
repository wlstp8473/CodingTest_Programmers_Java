/*
조합 공식 (팩토리얼 이용)
    n!
   ㅡㅡㅡ
(n-m)! x m! => share=30일 때 30!을 구해야 하므로 long, int로 표현 X 
=> 오버플로우 발생

=>직접 곱셉으로 접근
*/

class Solution {
    public int solution(int balls, int share) {
        long result = 1;
        
        for(int i = 1; i <=share; i++)
        {
            result = result * (balls - i + 1) / i;
        }
        return (int)result;
    }
}
// share = Math.min(share, balls - share); 활용해서 풀면, 반복횟수 감소(최적화 가능)
/*
class Solution {
    public int solution(int balls, int share) {
        
        share = Math.min(share, balls - share);
        
        long result = 1;
        
        for(int i = 1; i <= share; i++){
            result = result * (balls - i + 1) / i;
        }
        
        return (int)result;
    }
}
*/