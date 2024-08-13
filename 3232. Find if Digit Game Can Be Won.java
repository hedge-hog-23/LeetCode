class Solution {
    public boolean canAliceWin(int[] nums) {
        int oned = 0;
        int twod = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<10)
                oned+=nums[i];
            else
                twod+=nums[i];
        }
        return oned == twod ? false : true;
    }
}
