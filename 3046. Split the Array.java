class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int[] map = new int[101];
        for(int num: nums) {
            map[num]++;
            if(map[num] > 2)
                return false;
        }
        return true;
    }
}
