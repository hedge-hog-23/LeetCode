class Solution {
    public int kthFactor(int n, int k) {
        int ct = 0;
        ArrayList <Integer> a = new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i == 0){
                if(i*i != n){
                    System.out.println(n/i);
                    a.add(n/i);
                    
                }
                if(++ct == k) return i;     
            }
        }
        if(a.size()+ct < k)
            return -1;
        return a.get(a.size()-(k-ct));



}
}
