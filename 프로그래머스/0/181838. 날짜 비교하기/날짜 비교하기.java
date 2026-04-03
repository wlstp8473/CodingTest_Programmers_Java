/*
<비교 우선순위>
year 먼저 비교
같으면 → month 비교
같으면 → day 비교

*/
class Solution {
    public int solution(int[] date1, int[] date2) {
        //year 비교
        if(date1[0] < date2[0]) return 1;
        if(date1[0] > date2[0]) return 0;
        
        // month 비교
        if (date1[1] < date2[1]) return 1;
        if (date1[1] > date2[1]) return 0;
        
        // day 비교
        if (date1[2] < date2[2]) return 1;
        
        return 0;
    }
}
/*
//숫자로 변환해서 풀기

class Solution {
    public int solution(int[] date1, int[] date2) {
        int d1 = date1[0] * 10000 + date1[1] * 100 + date1[2];
        int d2 = date2[0] * 10000 + date2[1] * 100 + date2[2];
        
        return d1 < d2 ? 1 : 0;
    }
}
*/