class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String[] temp = new String[100001];

        for(int i=0;i<names.length;i++){
            temp[heights[i]] = names[i];
        }
        
        Arrays.sort(heights);

        String[] res=new String[names.length];
        for(int i=0;i<names.length;i++){
            res[i]=temp[heights[names.length-1-i]];
        }
        
        return res;
    }
}
