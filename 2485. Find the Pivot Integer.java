class Solution {
    public int pivotInteger(int n) {
        int y = n*(n+1)/2; //sum till n 
        int x = (int)Math.sqrt(y);  //newtons method
        if(x*x == y) 
            return x;
        else 
            return -1;
    }
}
