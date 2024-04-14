class Solution {
    public int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        int[] count = new int[128];
        for (char c: chars) {
            count[c]++;
        }
        int index = 0;
        for (char c: chars) {
            if (count[c] == 1) {
                return index;
            }
            index++;
        }
        return -1;
    }
}
