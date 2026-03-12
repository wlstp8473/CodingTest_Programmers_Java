/*
1. 선분이 지나가는 구간을 배열에 기록
2. 해당 좌표를 지나는 선분 개수 증가
3. 2개 이상인 구간 길이 카운트
*/

class Solution {
    public int solution(int[][] lines) {
        int[] arr = new int[201]; // -100 ~ 100
        
        for(int i = 0; i < 3; i++)
        {
            int start = lines[i][0];
            int end= lines[i][1];
            
            for(int j = start; j < end; j++)
            {
                arr[j + 100]++; //좌표 이동 (배열 인덱스는 음수 X)
            }
        }
        int answer = 0;
        
        for(int i = 0; i < 201; i++)
        {
            if(arr[i] >= 2) //겹치는 구간
            { 
                answer++;
            }
        }
        return answer;
    }
}