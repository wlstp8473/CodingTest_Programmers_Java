/*
보드의 크기와 이동 가능 범위 공식
maxX = board[0] / 2
maxY = board[1] / 2

| 키     | 이동  |
| ----- | ----- |
| up    | y + 1 |
| down  | y - 1 |
| left  | x - 1 |
| right | x + 1 |

*/    
    
class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int x = 0;
        int y = 0;
        
        int maxX = board[0] / 2;
        int maxY = board[1] / 2;
        
        for(String key : keyinput){
            if(key.equals("left") && x > -maxX){
                x--;
            }
            else if(key.equals("right") && x < maxX){
                x++;
            }
            else if(key.equals("up") && y < maxY){
                y++;
            }
            else if(key.equals("down") && y > -maxY){
                y--;
            }
        }
        return new int[]{x, y};
    }
}