class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tot_gas = 0;
        int tot_cost = 0;
        for(int i=0;i<gas.length;i++){
            tot_gas+=gas[i];
            tot_cost+=cost[i];
        }
        if(tot_gas<tot_cost) return -1;

        int fuel = 0;
        int ans = 0;
        for(int i=0;i<2 * gas.length;i++){
            fuel = fuel + gas[i%gas.length] - cost[i%cost.length];
            if(fuel<0){
                ans = i+1;
                fuel = 0;
            }
        }
        return ans%gas.length;
    }
}
