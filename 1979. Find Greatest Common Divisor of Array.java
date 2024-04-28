class Solution {
    public int findGCD(int[] nums) {
        // Arrays.sort(nums);
        // int a = nums[0];
        // int b = nums[nums.length-1];
        int a = 10000;
        int b = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>b){
                b = nums[i];
            }
            if(nums[i]<a){
                a = nums[i];
            }
        }
        
        while(b>0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}
