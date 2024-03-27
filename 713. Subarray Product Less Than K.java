class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int ct = 0;
        for(int i=0;i<n;i++){
            int sub =1;
            for(int j=i;j<n;j++){
                sub*=nums[j];
                if(sub>=k)
                    break;
                ct++;
            }
        }
        return ct;
    }
}
