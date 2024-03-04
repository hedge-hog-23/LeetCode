class Solution {
    public int findLucky(int[] arr) {
        int maxVal = 0;
        for (int num : arr) {
            maxVal = Math.max(maxVal, num);
        }

        int[] ct = new int[maxVal + 1];
        for (int i : arr) {
            ct[i]++;
        }

        int fg = -1;
        for (int i = 1; i < ct.length; i++) {
            if (i == ct[i]) {
                fg = i;
            }
        }

        return fg;
    }
}
