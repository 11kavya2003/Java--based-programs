import java.io.*;
import java.util.*;
 class MatrixMultiply
{
 public static void main(String args[])
 {
  int[][] matrix1 = {{1, 2}, {3, 4}};
  int[][] matrix2 = {{5, 6}, {7, 8}};
  int [][] matrix;
  int row1 = matrix1.length;
        int col1 = matrix1[0].length;
        int row2 = matrix2.length;
        int col2 = matrix2[0].length;
  int[][] result = new int[row1][col2];

        for (int i = 0; i < row1; i++) 
		{
            for (int j = 0; j < col2; j++)
			{
                for (int k = 0; k < col1; k++)
				{
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
		{
        for (int[] row : matrix)
		{
            for (int element : row) 
			{
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
	}
	}
	