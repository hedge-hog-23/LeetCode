// Write an algorithm to determine if a number n is happy.

// A happy number is a number defined by the following process:

// Starting with any positive integer, replace the number by the sum of the squares of its digits.
// Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
// Those numbers for which this process ends in 1 are happy.
// Return true if n is a happy number, and false if not.

 

// Example 1:

// Input: n = 19
// Output: true
// Explanation:
// 12 + 92 = 82
// 82 + 22 = 68
// 62 + 82 = 100
// 12 + 02 + 02 = 1
// Example 2:

// Input: n = 2
// Output: false
 

// Constraints:

// 1 <= n <= 231 - 1


class Solution {
    public boolean isHappy(int n) {
        int result = n;  
        while(result != 1 && result != 4) {  // Unhappy number ends in a cycle of repeating numbers which contains 4  
            result = findsq(result);  
        }  
          
        // Happy number always ends with 1  
        if(result == 1)  
            return true;
        
        else
            return false;
    }
    
    public int findsq(int num) {  
        int rem = 0, sum = 0;  
          
        // calculates the sum of squares of digits  
        while(num > 0) {  
            rem = num % 10;  
            sum += (rem * rem);  
            num = num / 10;  
        }  
        return sum;  
    }
}



// Accepted
// SENTHIL
// SENTHIL
// submitted at Feb 07, 2024 22:21

// Editorial

// Solution
// Runtime
// 0
// ms
// Beats
// 100.00%
// of users with Java
// Memory
// 40.46
// MB
// Beats
// 67.42%
// of users with Java
