class Solution {
    public String largestNumber(int[] nums) {
        String s[] = new String[nums.length];
        for(int i=0;i<nums.length;i++){
            s[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(s, (a,b) -> (b+a).compareTo(a+b));

        //https://chatgpt.com/c/66ea9a18-d3ac-800d-bd12-0d84c1630bf4

        if(s[0].equals("0")) return "0"; //EDGE CASE

        StringBuilder res = new StringBuilder();
        for(String i:s){
            res.append(i);
        }
        return res.toString();

    }
}
