class Solution {
    public int minOperations(String[] logs) {
        Stack<String> s = new Stack<>();
        for(String c : logs){
            if(c.equals("../") && !(s.isEmpty())){
                s.pop();
            }
            else if(!(c.equals("./"))){
                s.push(c);
            }

        }
        return s.size();
    }
}
