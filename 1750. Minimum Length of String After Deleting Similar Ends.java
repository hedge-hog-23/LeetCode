class Solution {
    public int minimumLength(String s) {
        //2-pointer concept

        int left = 0;
        int right = s.length()-1;
        while(left<right && s.charAt(left) == s.charAt(right)){  //palindrome check
            char ch = s.charAt(left);  //for consecutive occurences of chars
            while(left<=right && s.charAt(left) == ch)  // check if they're same
                left++;  //left pointer + 1
            while(left <= right && s.charAt(right) == ch)
                right--;   // right pointer -1 
        }
        return right-left+1;

    }
}
