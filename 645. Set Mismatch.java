// 645. Set Mismatch
// Solved
// Easy
// Topics
// Companies
// You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

// You are given an integer array nums representing the data status of this set after the error.

// Find the number that occurs twice and the number that is missing and return them in the form of an array.

 

// Example 1:

// Input: nums = [1,2,2,4]
// Output: [2,3]
// Example 2:

// Input: nums = [1,1]
// Output: [1,2]
 

// Constraints:

// 2 <= nums.length <= 104
// 1 <= nums[i] <= 104

class Solution {
  public int[] findErrorNums(int[] nums) {
    int arr[] = new int[nums.length+1]; //initially 0

     for(int i:nums)
         arr[i]++;         //[1,2,2,4]
                         //[0,1,2,0,1] count of each element (frequency)
    int dup=0 , miss=0;
    for(int i=1;i<arr.length;i++){
        if(arr[i] ==0)
             miss=i;
        if(arr[i]==2)
             dup=i;   
    }

return new int[]{dup,miss};
  
    }
}


// Accepted
// SENTHIL
// submitted at Jan 22, 2024 18:46

// Runtime
// 1
// ms
// Beats
// 100.00%
// of users with Java
      
      
