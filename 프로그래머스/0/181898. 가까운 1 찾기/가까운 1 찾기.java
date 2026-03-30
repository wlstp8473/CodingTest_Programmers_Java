//idx부터 끝까지 가면서 처음 나오는 1의 위치 찾기

class Solution {
    public int solution(int[] arr, int idx) {
        for(int i = idx; i < arr.length; i++){
            if(arr[i] == 1){
                return i;
            }
        }
        return -1;
    }
}