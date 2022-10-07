class Solution {
    public void rotate(int[][] matrix) {
        int[][] newMatrix = new int[matrix.length][matrix[0].length];
        for(int i=0, len=matrix.length; i<len; i++) {
            for(int j=0, lenJ=matrix[i].length; j<lenJ; j++) {
                newMatrix[j][i] = matrix[len-(i+1)][j];
            }
        }
        for(int i=0, len=matrix.length; i<len; i++) {
            for(int j=0, lenJ=matrix[i].length; j<lenJ; j++) {
                matrix[i][j] = newMatrix[i][j];
            }
        }
    }
}