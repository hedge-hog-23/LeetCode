// Given an integer n, return true if it is a power of two. Otherwise, return false.

// An integer n is a power of two, if there exists an integer x such that n == 2x.

 

// Example 1:

// Input: n = 1
// Output: true
// Explanation: 20 = 1
// Example 2:

// Input: n = 16
// Output: true
// Explanation: 24 = 16
// Example 3:

// Input: n = 3
// Output: false
 

// Constraints:

// -231 <= n <= 231 - 1
 

// Follow up: Could you solve it without loops/recursion?
  
  
  class Solution {
    public boolean isPowerOfTwo(int n) {
        // int ct =1;
        // for (int i=1;i<=n;i++){
        //     if(ct == n)
        //         return true;
        //     ct = ct*2;
            
        // }
        // return false;
        
        return n > 0 && (n & (n - 1)) == 0; 
        //explanation - powers of 2 always starts with 1 in binary format (like 2 = 10, 8 = 100...)
        //check if it has only 1 with it !!
    }   
}


// Accepted
// SENTHIL
// SENTHIL
// submitted at Feb 19, 2024 21:43

// Editorial

// Solution
// Runtime
// 0
// ms
// Beats
// 100.00%
// of users with Java
// Memory
// 40.77
// MB
// Beats
// 56.93%
// of users with Java
