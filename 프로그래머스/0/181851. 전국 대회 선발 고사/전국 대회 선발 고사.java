class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int a = -1;
        int b = -1;
        int c = -1;
        
        //1등부터 찾기
        for(int r = 1; r <= rank.length; r++){ 
            for(int i = 0; i < rank.length; i++){
                //참석 가능한 학생의 등수
                if(rank[i] == r && attendance[i]){
                    if(a == -1){
                        a = i;
                    }
                    else if(b == -1){
                        b = i;
                    }
                    else{
                        c = i;
                    return 10000 * a + 100 * b + c;
                    }
                }
            }
        }
        return 10000 * a + 100 * b + c;
    }
}