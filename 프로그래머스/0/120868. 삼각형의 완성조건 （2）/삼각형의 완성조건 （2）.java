//정렬 활용
/*
삼각형 조건 b-a < x < a+b 의 정수 개수를 계산하면
결과가 2a - 1이 된다. (a = 작은 변)
*/

import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        
        int a = sides[0];
        int b = sides[1];
        
        return(2 * a) - 1;
    }
}