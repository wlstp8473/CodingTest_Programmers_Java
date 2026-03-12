/*
문제 해결 순서
1. 최대공약수(GCD)로 약분
2. 분모의 소인수 확인 (2와 5만 남으면 유한소수)
3. 2 와 5 제거
4. 남은 값이 1인지 확인
*/
class Solution {
    public int solution(int a, int b) {
        int gcd = gcd(a, b);
        b /= gcd;
        
        while(b % 2 == 0) b /= 2;
        while(b % 5 == 0) b /= 5;
        
        if(b == 1) return 1;
        else return 2;
        
    }
    
    public int gcd(int a, int b){
        while(b != 0){
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}