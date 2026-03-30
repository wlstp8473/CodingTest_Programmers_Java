//배열 크기: 길이 = start_num - end_num + 1

class Solution {
    public int[] solution(int start_num, int end_num) {
        int size = start_num - end_num + 1;
        int[] answer = new int[size];
        int idx = 0;
        
        for(int i = start_num; i >= end_num; i--){
            answer[idx++] = i;
        }
        return answer;
    }
}

/*
//간단한 풀이법 (인덱스 활용)

class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[start_num - end_num + 1];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = start_num - i;
        }
        return answer;
    }
}
*/