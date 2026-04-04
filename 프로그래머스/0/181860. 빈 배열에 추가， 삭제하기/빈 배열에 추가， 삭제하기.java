/*
flag[i] == true  => arr[i] * 2번 뒤에 추가
flag[i] == false => arr[i]개     뒤에 제거

List<Integer> 쓰는 이유
배열은 크기가 고정이라서 뒤에 원소를 계속 추가/삭제하기 불편하기 때문에
마지막에 List<Integer> => int[] 변환 (문제 요구사항)
*/


import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    list.add(arr[i]);
                }
            } else {
                for (int j = 0; j < arr[i]; j++) {
                    list.remove(list.size() - 1);
                }
            }
        }

            int[] answer = new int[list.size()];
            for(int i = 0; i < list.size(); i++)
            {
                answer[i] = list.get(i);
            }
        return answer;
    }
}