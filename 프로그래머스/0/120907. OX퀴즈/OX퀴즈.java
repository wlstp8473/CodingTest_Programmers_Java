class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i = 0; i <quiz.length; i++)
        {
            String[] arr = quiz[i].split(" ");
            
            int x = Integer.parseInt(arr[0]);
            int y = Integer.parseInt(arr[2]);
            int z = Integer.parseInt(arr[4]);
            
            int result;
            
            if(arr[1].equals("+"))
            {
                result = x + y;
            }
            else
            {
                result = x - y;
            }
            if(result == z)
            {
                answer[i] = "O";
            }
            else
            {
                answer[i] = "X";
            }
        }
        return answer;
    }
}