/*
홀수 따로 처리하려는 경우는 필요 없음
if (num % 2 == 1) num = (num - 1) / 2; XXX

짝수든 홀수든 결국 "한 번 연산하면 x / 2 (내림)"과 동일
num /= 2;도 동일하게 동작
(홀수를 2K+1이라 가정할 때, (2K+1)/2 = K + 0.5(내림으로 삭제) => K )
*/

class Solution {
    public int solution(int[] num_list) {
        int count = 0;
        
        for(int num: num_list){
            while(num > 1){
                num /= 2;
                count++;
            }
        }
        return count;
    }
}