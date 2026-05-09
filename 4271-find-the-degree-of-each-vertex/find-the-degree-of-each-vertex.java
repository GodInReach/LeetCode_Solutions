class Solution {
    public int[] findDegrees(int[][] matrix) {
        int[] arr = new int[matrix.length];
        for (int i = 0; i<matrix.length; i++){
            int sum = 0;
            for (int j = 0; j<matrix.length; j++){
                if (matrix[i][j]==1){
                    sum++;
                }
            }
            arr[i]=sum;
        }
        return arr;
    }
}