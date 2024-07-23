class Solution {
    public int[] sortEvenOdd(int[] a) {
        for(int i=0;i<a.length;i+=2){
            for(int j=i+2;j<a.length;j+=2){
                if(a[j]<a[i]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int i=1;i<a.length;i+=2){
            for(int j=i+2;j<a.length;j+=2){
                if(a[j]>a[i]){
                    int temp1 = a[i];
                    a[i] = a[j];
                    a[j] = temp1;
                }
            }
        }
        return a;
    }
}
