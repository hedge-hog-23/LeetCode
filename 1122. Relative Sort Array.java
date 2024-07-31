class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int max = 0;
        for(int i=0;i<arr1.length;i++){
            max = Math.max(max,arr1[i]);
        }

        int[] ct = new int[max+1];
        for(int i=0;i<arr1.length;i++){
            ct[arr1[i]]++;
        }

        int[] ans = new int[arr1.length];
        int index = 0;
        for(int i=0;i<arr2.length;i++){
            while(ct[arr2[i]] >0){
                ans[index] = arr2[i];
                index++;
                ct[arr2[i]]--;
            }
        }
        for(int i=0;i<ct.length;i++){
            while(ct[i]>0){
                ans[index] = i;
                index++;
                ct[i]--;
            }
        }
        return ans;
    }
}
