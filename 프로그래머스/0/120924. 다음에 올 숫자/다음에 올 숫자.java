class Solution {
    public int solution(int[] common) {
        int n = common.length;
        
        //앞의 세 숫자를 통해 등차 or 등비수열 판단 가능
        int diff1 = common[1] - common[0];
        int diff2 = common[2] - common[1];
        
        //등차 수열
        if(diff1 == diff2){
            return common[n-1] + diff1;
        }
        
        //등비 수열
        int ratio = common[1] / common[0];
        return common[n-1] * ratio;
    }
}