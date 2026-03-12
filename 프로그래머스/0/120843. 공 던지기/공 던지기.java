/*
(k - 1) * 2 % numbers.length
공을 던질 때마다 2칸 이동하고 원형 배열이므로 나머지로 위치를 계산

1. numbers[0] (처음 공을 가진 사람은 1번 => k-1)
2. 한 번 던질 때마다 +2 이동 (엔덱스로 보면 => (k-1)* 2)
3. 배열 끝을 넘으면 처음으로 순환 (index + 2) % numbers.length)
*/
class Solution {
    public int solution(int[] numbers, int k) {
        int index = (k - 1) * 2 %numbers.length;
            return numbers[index];
    }
}