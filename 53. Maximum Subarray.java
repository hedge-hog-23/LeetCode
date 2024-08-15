//kadane's algorithm
  class Solution {
    public int maxSubArray(int[] nums) {
        int max_sub = nums[0];
        int currsum = 0;
        for(int i=0;i<nums.length;i++){
            if(currsum<0) 
                currsum = 0;
            currsum+=nums[i];
            max_sub = Math.max(currsum,max_sub);
        }
        return max_sub;
    }
}
