class Solution {
    public int solution(int[] numbers, int n) {
        int sum = 0;
        
        for(int num : numbers){
            sum += num;
            
            if(sum > n){
                return sum;
            }
        }
        return sum; //문제 조건 상, 항상 위 조건문에서 return 됨
    }
}