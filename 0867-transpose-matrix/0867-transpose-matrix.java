class Solution {
    public int[][] transpose(int[][] matrix) {
        int clm = matrix[0].length;
        int row = matrix.length;
        int res[][] = new int[clm][row];
        for(int i=0; i < row; i++){
            for(int j = 0; j < clm;j++){
                res[j][i] = matrix[i][j]; 
            }
        }
        return res;

    }
}