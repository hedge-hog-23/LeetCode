class Solution {
    public int appendCharacters(String s, String t) {
        int s1 = 0;
        int t1 = 0;
        int s2 = s.length();
        int t2 = t.length();
        int ans = 0;
        while(s1<s2 && t1<t2){
            if(s.charAt(s1) ==t.charAt(t1)){
                t1++;
            }
            s1++;
        }
        ans = t2-t1;
        return ans;

    }
}
