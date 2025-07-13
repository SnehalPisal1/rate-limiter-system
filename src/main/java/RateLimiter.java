/*

Statement: Implement a rate limiter for an API that allows a user to make at most N requests in a T-second window. Return true if a request is allowed, false otherwise.
Example:

RateLimiter limiter = new RateLimiter(3, 60); // 3 requests per 60 seconds
limiter.allowRequest("user1", 1);  // true
limiter.allowRequest("user1", 2);  // true
limiter.allowRequest("user1", 3);  // true
limiter.allowRequest("user1", 4);  // false
limiter.allowRequest("user1", 61); // true (window resets)
 */

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;

public class RateLimiter {

    private final int maxRequest;
    private final long timeWindow;

    ConcurrentHashMap<String, ConcurrentLinkedDeque<Long>> userRequestMap;

    public RateLimiter(int maxRequest, long timeWindow){
        this.maxRequest = maxRequest;
        this.timeWindow = timeWindow;
        userRequestMap =  new ConcurrentHashMap<>();
    }

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

    public synchronized boolean allowRequest(String userId, long reqTimestamp) {


    }

}


