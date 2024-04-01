class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int len = 0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!= ' ')  //counts entire length
                len+=1;
            else if (len>0)
                break;       //breaks the length after 1 single word(i.e., the last)
            

        }
        return len;
    }
}
