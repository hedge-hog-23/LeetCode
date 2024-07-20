class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> rowmin = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            int r_min = Integer.MAX_VALUE;
            for(int j=0;j<matrix[0].length;j++){
                r_min = Math.min(r_min,matrix[i][j]);
            }
            rowmin.add(r_min);
        }

        List<Integer> colmax = new ArrayList<>();
        for(int i=0;i<matrix[0].length;i++){
            int c_max = Integer.MIN_VALUE;
            for(int j=0;j<matrix.length;j++){
                c_max = Math.max(c_max,matrix[j][i]);
            }
            colmax.add(c_max);
        }

        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == rowmin.get(i) && matrix[i][j] == colmax.get(j)) {
                    res.add(matrix[i][j]);
                }
            }
        }

        return res;


        
        
    }
}
