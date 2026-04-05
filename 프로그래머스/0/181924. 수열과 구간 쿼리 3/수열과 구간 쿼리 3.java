// 문제의 조건 상, 인덱스만 교환하면 됨

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int[] query : queries){
            int i = query[0];
            int j = query[1];
            
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }
}

/*
//인덱스 풀이
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int k = 0; k < queries.length; k++) {
            int i = queries[k][0];
            int j = queries[k][1];

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        return arr;
    }
}
*/