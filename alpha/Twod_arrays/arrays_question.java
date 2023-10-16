package Twod_arrays;

public class arrays_question {
    public static boolean staircase_search(int matrix[][], int key){
        int row=0; int col=matrix[0].length-1;
        while (row<matrix.length && col>=0) {
            if (key==matrix[row][col]) {
                System.out.println("this is the sell no - ("+row+","+col+")");
                return true;
            }
            if (key<matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]={{1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16}};
                       // System.out.println(diagonalSum(matrix));
        staircase_search(matrix, 16);
    }
}
