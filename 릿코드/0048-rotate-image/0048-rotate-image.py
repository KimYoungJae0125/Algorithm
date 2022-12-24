class Solution:
    def rotate(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        newMatrix = [[matrix[(len(matrix)-1)-index][i] for index, value in enumerate(matrix)] for i in range(len(matrix))]
        for index, value in enumerate(newMatrix):
            matrix[index] = value
