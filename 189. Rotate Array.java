class Solution {
    public void reverse(int[] nums, int i ,int j){
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];      //reverse logic
            nums[j] = temp;
        
            i++;
            j--;
        }
    }
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
       reverse(nums,0,nums.length-1);  //total array
       reverse(nums,0,k-1);   //till k
       reverse(nums,k,nums.length-1); //k to len of array
    }
}
