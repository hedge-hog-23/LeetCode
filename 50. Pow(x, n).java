// Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

 

// Example 1:

// Input: x = 2.00000, n = 10
// Output: 1024.00000
// Example 2:

// Input: x = 2.10000, n = 3
// Output: 9.26100
// Example 3:

// Input: x = 2.00000, n = -2
// Output: 0.25000
// Explanation: 2-2 = 1/22 = 1/4 = 0.25
 

// Constraints:

// -100.0 < x < 100.0
// -231 <= n <= 231-1
// n is an integer.
// Either x is not zero or n > 0.
// -104 <= xn <= 104



class Solution {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }

        if (n < 0) {
            x = 1 / x;
            // edge case  n is Integer.MIN_VALUE
            if (n == Integer.MIN_VALUE) {
                x *= x;
                n /= 2;
            }
            n = -n;
        }

        double result = 1.0;
        while (n > 0) {
            if (n % 2 == 1) {
                result *= x;   //binary exponentiation concept - less time
            }
            x *= x;
            n /= 2;
        }

        return result;
    }
}





// Accepted
// SENTHIL
// SENTHIL
// submitted at Jan 29, 2024 21:38

// Editorial

// Solution
// Runtime
// 0
// ms
// Beats
// 100.00%
// of users with Java
// Memory
// 41.85
// MB
// Beats
// 54.66%
// of users with Java
