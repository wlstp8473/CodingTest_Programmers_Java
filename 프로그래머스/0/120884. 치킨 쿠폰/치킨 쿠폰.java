class Solution {
    public int solution(int chicken) {
        int coupon = chicken; //처음 쿠폰 개수 = 주문한 치킨 수
        int result = 0; // 총 서비스 치킨 수
        
        while(coupon >= 10){
            int service = coupon / 10; // 서비스 치킨
            result += service;
            coupon = coupon % 10 + service; // 남은 쿠폰 + 새 쿠폰
            
        }
        return result;
    }
}