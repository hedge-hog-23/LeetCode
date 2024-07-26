class Solution {
    public long[] sumOfThree(long n) {
        
        //in ap series consecutive numbers -> a-d, a, a+d -> add them 3a , so must by div by 3 else not possible
        if(n%3 == 0){
            long arr[] = new long[3];
            arr[0] = n/3-1;
            arr[1] = n/3;
            arr[2] = n/3 + 1;
            return arr;
        }
        else{
            long ar[] = new long[0];
            return ar;
        }
        
    }
}
