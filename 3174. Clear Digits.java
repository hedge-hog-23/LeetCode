class Solution {
    public String clearDigits(String s) {
        Stack <Character> stk = new Stack<>();
        for(char i:s.toCharArray()){
            if(Character.isDigit(i) && !(stk.isEmpty())){
                stk.pop();
            }
            else{
            stk.push(i);
            }

        }
        String ans = "";
        for(char i:stk){
            ans+=i;
        }
        return ans;

        
    }
}  
