class Solution {
    public String kthDistinct(String[] arr, int k) {
        ArrayList <String> list = new ArrayList<>();
        Map<String,Integer> map = new LinkedHashMap<>();

        //frequency 

        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        //add to arraylist if freq is 1
        for(String i : map.keySet()){
            if(map.get(i) == 1){
                list.add(i);
            }
        }
        
        if(k<=list.size()) return list.get(k-1);
        return "";
    }
}
