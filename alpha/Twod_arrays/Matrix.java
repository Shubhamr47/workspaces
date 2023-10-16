package Twod_arrays;

import java.util.*;

import javax.swing.plaf.TextUI;
public class Matrix {
    public static boolean search(int Matrix[][],int key){
        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[0].length; j++) {
                if (Matrix[i][j]==key) {
                    System.out.print("found at sell ("+i+","+j+")");
                    return true;
                }
            }  
        }
        System.out.println("not found");
        return false; 
    }
    public static void main(String[] args) {
        int matrix[][] = new int [3][3];
        int n= matrix.length,m= matrix[0].length;
        System.out.println("enter the number ");
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for(int j=0;j<m;j++){
                System.out.print("please enter next number");               
                matrix[i][j] = sc.nextInt();
                //System.out.print("please enter next number");
            }
        }
        for (int i = 0; i < n; i++) {
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        search(matrix, 5);
    }
}
