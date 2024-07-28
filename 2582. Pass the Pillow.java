class Solution {
    public int passThePillow(int n, int t) {
        int no_of_cycles_completed = t/(n-1);
        int time_left_after_complete_cycle = t % (n-1);
        if(no_of_cycles_completed %2 !=0){
            return n - time_left_after_complete_cycle;
        }
        return time_left_after_complete_cycle +1;
    }
}
