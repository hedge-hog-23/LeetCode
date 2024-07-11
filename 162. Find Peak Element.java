//linear search approach

class Solution {
    public int findPeakElement(int[] nums) {
        int ans = 0;
        
        if (nums.length == 1) {
            return 0;
        }
        //check if the 1st element is a peak
        if (nums[0] > nums[1]) {
            return 0;
        }
        
        //check if the last element is a peak
        if (nums[nums.length - 1] > nums[nums.length - 2]) {
            return nums.length - 1;
        }
        

        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i - 1] < nums[i] && nums[i] > nums[i + 1]) {
                return i;
            }
        }
        
        return ans; 
    }
}


 /*binary search approach using python 
 
class Solution:
    def findPeakElement(self, nums: List[int]) -> int:
        if len(nums) == 0: 
            return 0
        left,right = 0,len(nums)-1
        while(left<right):
            mid = (left + right) // 2
            if(nums[mid]>nums[mid+1]):
                right = mid
            else:
                left = mid +1 
            
        return left*/
        

        
