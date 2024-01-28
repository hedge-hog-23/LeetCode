// Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

// Return any array that satisfies this condition.

 

// Example 1:

// Input: nums = [3,1,2,4]
// Output: [2,4,3,1]
// Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
// Example 2:

// Input: nums = [0]
// Output: [0]

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int start = 0;
        int end = n - 1;

         if(n ==1)
            return nums;
        while(start<end){
            for(int i=0;i<n;i++){
                if(nums[i]%2 == 0){
                    arr[start] = nums[i];
                    start++;
                }
                else{
                    arr[end] = nums[i];
                    end--;
                }
            }
        }

        return arr;

    }
}




// Accepted
// SENTHIL
// SENTHIL
// submitted at Jan 28, 2024 21:32

// Editorial

// Solution
// Runtime
// 0
// ms
// Beats
// 100.00%
// of users with Java
// Memory
// 44.59
// MB
// Beats
// 66.67%
// of users with Java
