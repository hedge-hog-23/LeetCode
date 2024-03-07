class Solution {
    public int[] runningSum(int[] nums) {
        int[] arr = new int[nums.length];
        int s = 0;
        for(int i=1;i<=nums.length;i++){
            s+=nums[i-1];
            arr[i-1] = s;
        }
        return arr;
    }
}
