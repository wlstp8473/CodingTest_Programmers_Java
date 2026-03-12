/*
기울기 = y2-y1 / x2-x1

기울기 조합 비교
(0,1) vs (2,3)
(0,2) vs (1,3)
(0,3) vs (1,2)
*/
class Solution {
    public int solution(int[][] dots) {
        if(slope(dots[0], dots[1]) == slope(dots[2], dots[3])) return 1;
        if(slope(dots[0], dots[2]) == slope(dots[1], dots[3])) return 1;
        if(slope(dots[0], dots[3]) == slope(dots[1], dots[2])) return 1;
        
        return 0;
    }
    
    public double slope(int[] a, int[] b){
        return (double)(b[1] - a[1]) / (b[0] - a[0]); //정수 나눗셈 방지 => double 사용
    }
}


/*
//double 오차 방지를 위해, 나눗셈 대신 곱셈 비교를 수행해볼 수 있음
class Solution {
    
    public int solution(int[][] d) {
        
        if(parallel(d[0],d[1],d[2],d[3])) return 1;
        if(parallel(d[0],d[2],d[1],d[3])) return 1;
        if(parallel(d[0],d[3],d[1],d[2])) return 1;
        
        return 0;
    }
    
    boolean parallel(int[] a, int[] b, int[] c, int[] d){
        return (b[1]-a[1])*(d[0]-c[0]) == (d[1]-c[1])*(b[0]-a[0]);
    }
}

*/