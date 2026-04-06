
/*
단순 풀이: 구간 [s,e] 돌면서 +1 하면 끝
이중 for문 => 시간 복잡도 O(N×Q)
*/


class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int[] query : queries){
            int s = query[0];
            int e = query[1];
            
            for(int i = s; i <= e; i++){
                arr[i]++;
            }
        }
        return arr;
    }
}



/*
//누적합 => 시간 복잡도 O(N+Q)
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int n = arr.length;
        int[] diff = new int[n + 1];
        
        for (int[] q : queries) {
            int s = q[0];
            int e = q[1];
            
            diff[s] += 1;
            if (e + 1 < n) diff[e + 1] -= 1;
        }
        
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += diff[i];
            arr[i] += sum;
        }
        
        return arr;
    }
}
*/