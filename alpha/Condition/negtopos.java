package Condition;

import java.util.Scanner;

public class negtopos {
    public static void main(String[] args) {
        System.out.println("Enter the numba :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num>0) {
            System.out.println("positive number");
        } 
        else {
            System.out.println("negative number");
        }
        sc.close();
    }
}
