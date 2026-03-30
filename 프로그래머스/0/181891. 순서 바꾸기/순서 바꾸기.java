//n번째 원소를 기준으로 0 ~ n-1까지를 뒷부분에 붙인다 (n ~ 끝)

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int idx = 0;
        
        //n번째 이후
        for(int i = n; i < num_list.length; i++){
            answer[idx++] = num_list[i];
        }
        //n번째 까지
        for(int i = 0; i < n; i++){
            answer[idx++] = num_list[i];
        }
        return answer;
    }
}

/*
//간단한 풀이법, System.arraycopy 활용
//System.arraycopy(원본배열, 시작인덱스, 대상배열, 시작인덱스, 복사길이);

class Solution {
    public int[] solution(int[] num_list, int n) {
        int len = num_list.length;
        int[] answer = new int[len];
        
        System.arraycopy(num_list, n, answer, 0, len - n);
        System.arraycopy(num_list, 0, answer, len - n, n);
        
        return answer;
    }
}
*/