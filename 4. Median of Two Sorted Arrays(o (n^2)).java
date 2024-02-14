// Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

// The overall run time complexity should be O(log (m+n)).

 

// Example 1:

// Input: nums1 = [1,3], nums2 = [2]
// Output: 2.00000
// Explanation: merged array = [1,2,3] and median is 2.
// Example 2:

// Input: nums1 = [1,2], nums2 = [3,4]
// Output: 2.50000
// Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 


class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = mergeArrays(nums1, nums2);
        Arrays.sort(mergedArray);
        double median =0;
        int n = mergedArray.length;
        if(mergedArray.length % 2 == 0){
            median = (mergedArray[n/2] + mergedArray[n/2 -1 ])/2;
        }
        else
            median = mergedArray[n/2];
        
        return median;
    }

    private static int[] mergeArrays(int[] array1, int[] array2) {
        int[] mergedArray = new int[array1.length + array2.length];

        // Copy elements from array1
        System.arraycopy(array1, 0, mergedArray, 0, array1.length);

        // Copy elements from array2
        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);

        return mergedArray;
    }
}


// Accepted
// SENTHIL
// SENTHIL
// submitted at Feb 14, 2024 20:02

// Editorial

// Solution
// Runtime
// 5
// ms
// Beats
// 33.56%
// of users with Java
// Memory
// 46.25
// MB
// Beats
// 18.63%
// of users with Java
