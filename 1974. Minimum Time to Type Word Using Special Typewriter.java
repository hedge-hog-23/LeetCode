class Solution {
    public int minTimeToType(String word) {
        int ct = 0;
        char ptr = 'a';
        for(int i=0;i<word.length();i++){
            int dif = Math.abs(word.charAt(i) - ptr);
            ct = ct + Math.min(dif,26-dif);
            ptr = word.charAt(i);
        }
        return ct + word.length();
    }
}
