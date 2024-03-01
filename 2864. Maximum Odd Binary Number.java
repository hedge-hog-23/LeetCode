class Solution {
    public String maximumOddBinaryNumber(String s) {
        StringBuilder s1 = new StringBuilder();
        int ct1 = 0;
        int ct0 = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '1')
                ct1++;
            else
                ct0++;
        }
        for(int i=0;i<ct1-1;i++)
            s1.append(1);
        for(int i=0;i<ct0;i++)
            s1.append(0);
        s1.append(1);
            
        
        return s1.toString();
            
    }
}
