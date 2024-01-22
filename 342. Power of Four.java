// Given an integer n, return true if it is a power of four. Otherwise, return false.

// An integer n is a power of four, if there exists an integer x such that n == 4x.

 

// Example 1:

// Input: n = 16
// Output: true
// Example 2:

// Input: n = 5
// Output: false
// Example 3:

// Input: n = 1
// Output: true
 

// Constraints:

// -231 <= n <= 231 - 1
 

// Follow up: Could you solve it without loops/recursion?
  
  class Solution {
    public boolean isPowerOfFour(int n) {
       //loops not allowed , so we use recursion

       if(n == 0)
        return false; //base case
       if(n == 1)
        return true; //resultant
       if(n%4 != 0)
        return false;  //if a number is not divisible by 4 , it cant be its power .. right ;) 

    return isPowerOfFour(n/4);   //recursion
    }
}

// Accepted
// SENTHIL
// submitted at Jan 22, 2024 19:03
// Runtime
// 0
// ms
// Beats
// 100.00%
// of users with Java
