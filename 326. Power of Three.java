// Given an integer n, return true if it is a power of three. Otherwise, return false.

// An integer n is a power of three, if there exists an integer x such that n == 3x.

 

// Example 1:

// Input: n = 27
// Output: true
// Explanation: 27 = 33
// Example 2:

// Input: n = 0
// Output: false
// Explanation: There is no x where 3x = 0.
// Example 3:

// Input: n = -1
// Output: false
// Explanation: There is no x where 3x = (-1).
 

// Constraints:

// -231 <= n <= 231 - 1
 

// Follow up: Could you solve it without loops/recursion?
  
  
  class Solution {
    public boolean isPowerOfThree(int n) {
        double res = Math.log10(n)/Math.log10(3); // n = 9 , find log(9) and log(3) , => res = 4 , if res and int(res) are same return true , else would return some x.xxx (not integer)
        return (res == (int)res);
            
    }
}

// SENTHIL
// submitted at Feb 01, 2024 15:13

// Editorial

// Solution
// Runtime
// 8
// ms
// Beats
// 90.79%
// of users with Java
// Memory
// 44.18
// MB
// Beats
// 27.75%
// of users with Java
