class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        return Arrays.stream(matrix)
                .anyMatch(i -> Arrays.stream(i).anyMatch(j -> j == target));
    }
}