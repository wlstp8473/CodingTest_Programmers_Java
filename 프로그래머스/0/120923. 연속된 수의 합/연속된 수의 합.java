/*
연속된 수의 평균은 가운데 값임 avg = total / num
연속된 수열의 시작값을 구하면 쉽게 해결됨
start = total / num - (num - 1) / 2
*/

class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int start = total / num - (num - 1) / 2;
        
        for(int i = 0; i < num; i++){
            answer[i] = start + i;
        }
        return answer;
    }
}