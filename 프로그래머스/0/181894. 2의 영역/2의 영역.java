/*
풀이 아이디어
처음 등장하는 2의 인덱스
마지막 등장하는 2의 인덱스를 찾은 뒤, 그 구간을 잘라내기
*/

import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int start = -1;
        int end = -1;
        
        //첫 2찾기
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2){
                start = i;
                break;
            }
        }
        
        if(start == -1){
            return new int[]{-1};
        }
        
        //마지막 2찾기
        for(int i = arr.length - 1; i >= 0; i--){
            if(arr[i] == 2){
                end = i;
                break;
            }
        }
        //start ~ end 구간 반환
        return Arrays.copyOfRange(arr, start, end + 1);
    }
}