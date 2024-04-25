public class Solution {
    public String truncateSentence(String s, int k) {
        String[] arr = s.split(" ");
        StringBuilder res = new StringBuilder();
        int ct = 0;
        for (String i : arr) {
            res.append(i).append(" ");
            ct++;
            if (ct == k)
                break;
        }
        return res.toString().trim();
    }
}
