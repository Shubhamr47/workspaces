package array;

import java.util.*;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the arrays rows and cols :");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] number = new int[rows][cols];

        // row
        // input
        for (int i = 0; i < rows; i++) {
            // colomns
            for (int j = 0; j < cols; j++) {
                number[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(number[i][j] + " ");
                if (number[i][j] == x) {
                    System.out.println("x found at location (" + i + ", " + j + ")");
                }
            }

        }

        sc.close();
    }
}

// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// int rows = sc.nextInt();
// int cols = sc.nextInt();
// int[][] numbers = new int[rows][cols];
// //input
// //rows
// for(int i=0; i<rows; i++) {
// //columns
// for(int j=0; j<cols; j++) {
// numbers[i][j] = sc.nextInt();
// }
// }
// int x = sc.nextInt();
// for(int i=0; i<rows; i++) {
// for(int j=0; j<cols; j++) {
// //compare with x
// if(numbers[i][j] == x) {
// System.out.println("x found at location (" + i + ", " + j +
// ")");
// }
// }
// }
// }
// }