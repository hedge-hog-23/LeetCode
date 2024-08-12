class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int ct = 0;
        int mid = nums[nums.length/2];
        for(int i=0;i<nums.length;i++){
            ct+=Math.abs(mid-nums[i]);
        }
        return ct;
    }
}
