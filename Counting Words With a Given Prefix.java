class Solution {
    public int prefixCount(String[] words, String pref) {
        int ct = 0;
        for(String s : words){
            if(s.indexOf(pref) == 0)
                ct++;
        }
        return ct;
    }
}
