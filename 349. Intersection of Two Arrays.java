class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set <Integer> x = new HashSet<>();
        Set <Integer> com = new HashSet<>();
        for(int i : nums1){
            x.add(i);
        }
        for(int i: nums2){
            if(x.contains(i)){
                com.add(i);
            }
        }
        int[] arr = new int[com.size()];
        int idx = 0;
        for (int i : com) {
            arr[idx++] = i;
        }

        return arr;

        
        
    }
}
