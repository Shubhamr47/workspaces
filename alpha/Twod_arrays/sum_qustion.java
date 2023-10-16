package Twod_arrays;

public class sum_qustion {
//     public static boolean sumQustion(int matrix[][]){
//         int row=0; int col=matrix[0].length-1;
//         while (row<matrix.length && col>=0) {
//             if (row==2 || col<=matrix[0].length) {
//                 System.out.println("yooy   ");
//                 return true;
//             }
//         }
//             System.out.println("that is not found");
//             return false;
//     }
//     public static void main(String[] args) {
//         int matrix[][]={{1, 2, 3, 4},
//                         {5, 6, 7, 8},
//                         {9, 10, 11, 12},
//                         {13, 14, 15, 16}};
//                        // System.out.println(diagonalSum(matrix));
//         sumQustion(matrix);
//     }

public static void main(String[] args) {
    int [][] nums={{4,5,6,8},{9,8,7,6},{6,4,7,8}};
    int sum=0;
    for (int i = 0; i < nums[0].length; i++) {
        sum+= nums[1][i];
    }
    System.out.println("sum is"+sum);
}
}
