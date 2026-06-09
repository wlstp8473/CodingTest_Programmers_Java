/*
<풀이 아이디어>
주사위 숫자별 개수를 세고
개수 패턴이 4개/3개/2개/1개인지에 따라 점수를 계산

*/

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] count = new int[7];

        count[a]++;
        count[b]++;
        count[c]++;
        count[d]++;

        int p = 0;
        int q = 0;
        int r = 0;

        // 4개가 모두 같은 경우
        for (int i = 1; i <= 6; i++) {
            if (count[i] == 4) {
                return 1111 * i;
            }
        }

        // 3개가 같고 하나가 다른 경우
        for (int i = 1; i <= 6; i++) {
            if (count[i] == 3) {
                p = i;
            } else if (count[i] == 1) {
                q = i;
            }
        }

        if (p != 0) {
            return (10 * p + q) * (10 * p + q);
        }
        
        //3, 4번 경우
        int pairCount = 0;
        int[] pair = new int[4];
        int[] single = new int[4];

        int pairIdx = 0;
        int singleIdx = 0;
        
        for (int i = 1; i <= 6; i++) {
            if (count[i] == 2) {
                pair[pairIdx++] = i;
                pairCount++;
            } else if (count[i] == 1) {
                single[singleIdx++] = i;
            }
        }

        //2개씩 같은 경우
        if (pairCount == 2) {
            p = pair[0];
            q = pair[1];

            return (p + q) * Math.abs(p - q);
        }

        //2개만 같고 나머지 2개가 다른 경우
        if (pairCount == 1) {
            q = single[0];
            r = single[1];

            return q * r;
        }

        //모두 다른 경우
        int min = 7;

        for (int i = 1; i <= 6; i++) {
            if (count[i] == 1) {
                min = Math.min(min, i);
            }
        }

        return min;
    }
}