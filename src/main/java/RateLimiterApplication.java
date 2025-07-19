public class RateLimiterApplication {

    public static void main(String args[]){
        RateLimiter limiter = new RateLimiter(3, 60); // 3 requests per 60 seconds
        System.out.println(limiter.allowRequest("user1", 1)); // true
        System.out.println(limiter.allowRequest("user1", 2));  // true
        System.out.println(limiter.allowRequest("user2", 9));  // true
        System.out.println(limiter.allowRequest("user1", 3));  // true
        System.out.println(limiter.allowRequest("user1", 4));  // false
        System.out.println(limiter.allowRequest("user1", 5));  // false
        System.out.println(limiter.allowRequest("user1", 61)); // true (window resets)

    }

}
