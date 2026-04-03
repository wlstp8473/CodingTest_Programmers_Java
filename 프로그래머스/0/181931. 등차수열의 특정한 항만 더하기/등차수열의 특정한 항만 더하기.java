/*
등차수열의 각 항을 만들면서 included[i]가 true인 항만 더하면 되는 문제

등차수열의 i+1번째 항 = a + i * d
*/

class Solution {
    public int solution(int a, int d, boolean[] included){
        int sum = 0;
        
        for(int i = 0; i < included.length; i++){
            if(included[i]){
                sum += a + i * d;
            }
        }
        return sum;
    }
}