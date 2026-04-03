/*
배열 길이를 확인해서, 다음 2의 거듭제곱 길이까지 0을 채우는 문제

배열 길이를 len이라고 할 때,
이미 len이 2의 거듭제곱이면 그대로 반환
아니면 len보다 크거나 같은 가장 작은 2의 거듭제곱을 찾고
그 길이만큼 새 배열을 만든 뒤
기존 값을 복사하면 나머지는 자동으로 0으로 채워짐

자바의 int[]는 기본값이 0이라서 따로 0을 넣을 필요가 없음
*/
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        int size = 1;
        
        while(size < len){
            size *= 2;
        }
        return Arrays.copyOf(arr, size);
    }
}