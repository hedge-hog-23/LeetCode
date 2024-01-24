

// Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

 

// Example 1:

// Input: haystack = "sadbutsad", needle = "sad"
// Output: 0
// Explanation: "sad" occurs at index 0 and 6.
// The first occurrence is at index 0, so we return 0.
// Example 2:

// Input: haystack = "leetcode", needle = "leeto"
// Output: -1
// Explanation: "leeto" did not occur in "leetcode", so we return -1.
 

// Constraints:

// 1 <= haystack.length, needle.length <= 104
// haystack and needle consist of only lowercase English characters.

class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.contains(needle)) {
            return haystack.indexOf(needle);
        }
        return -1;
    }
}


// actually we should go with algos lives naive string matching , kmp and stuffs !!


// Accepted
// SENTHIL
// SENTHIL
// submitted at Jan 24, 2024 22:03

// Editorial

// Solution
// Runtime
// 0
// ms
// Beats
// 100.00%
// of users with Java
// Memory
// 41.36
// MB
// Beats
// 40.73%
// of users with Java
