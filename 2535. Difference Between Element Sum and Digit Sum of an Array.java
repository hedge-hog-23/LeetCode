class Solution {
    public int differenceOfSum(int[] nums) {
        int sum0 =0;
        int sum = 0;
        for(int n : nums){
            sum0+=n;
            while(n>0){
                sum+=n%10;
                n = n/10;
            }
        }
        return Math.abs(sum0-sum);
    }
}
