// Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

// You must write an algorithm with O(log n) runtime complexity.

 

// Example 1:

// Input: nums = [1,3,5,6], target = 5
// Output: 2
// Example 2:

// Input: nums = [1,3,5,6], target = 2
// Output: 1
// Example 3:

// Input: nums = [1,3,5,6], target = 7
// Output: 4
 

// Constraints:

// 1 <= nums.length <= 104
// -104 <= nums[i] <= 104
// nums contains distinct values sorted in ascending order.
// -104 <= target <= 104

class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while (start <= end) {
            int mid = (start + end)/2;   //normal binary search
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) end = mid-1;
            else start = mid+1;
        }

        return start;  //returning start cuz , its where is the em=lemet is to be inserted !!
    }
}


// Accepted
// SENTHIL
// SENTHIL
// submitted at Feb 04, 2024 21:08

// Editorial

// Solution
// Runtime
// 0
// ms
// Beats
// 100.00%
// of users with Java
// Memory
// 42.53
// MB
// Beats
// 93.87%
// of users with Java
