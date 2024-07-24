class Solution {
    public void moveZeroes(int[] nums) {
        int ct = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[ct] = nums[i];
                ct++;
            }
        }
        for(int i=nums.length-1;i>ct-1;i--){
            nums[i] = 0;
        }
        
    }
}
