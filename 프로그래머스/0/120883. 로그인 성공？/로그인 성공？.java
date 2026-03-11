class Solution {
    public String solution(String[] id_pw, String[][] db) {
        for(int i = 0; i < db.length; i++){
            //아이디가 같은 경우
            if(db[i][0].equals(id_pw[0])){
                //비밀번호도 같은 경우
                if(db[i][1].equals(id_pw[1])){
                    return "login";
                }
                else{
                    return "wrong pw";
                }
            }
        }
        //아이디 자체가 없는 경우
        return "fail";
    }
}