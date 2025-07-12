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


}


