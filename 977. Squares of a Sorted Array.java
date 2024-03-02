class Solution {
    public int[] sortedSquares(int[] nums) {
        int [] arr = new int[nums.length];
        int tc=0;
        for(int i : nums){
            arr[tc] = i*i;
            tc++;
        }
        Arrays.sort(arr);
        return arr;

    }
}
