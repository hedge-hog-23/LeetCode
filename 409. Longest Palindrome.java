class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> freq = new HashSet<>();
        int res = 0;
        for (char c : s.toCharArray()){
            if(freq.contains(c)){
                freq.remove(c);   //even repeats 
                res+=2;
            }
            else
                freq.add(c);    //odd
            
        }
        if(!freq.isEmpty()){
            res+=1;            //for single repeating cgarcaters 
        }

        return res;


    }
}
