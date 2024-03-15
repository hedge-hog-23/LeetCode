class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ct = 1;
        int prod = 1;
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i] = prod;
            prod = prod * nums[i];
            
        }
        int prod1 = 1;
        for(int i=nums.length-1;i>=0;i--){
            arr[i] = arr[i]* prod1;
            prod1 = prod1 * nums[i];
        }
        return arr;
        

    }
}
