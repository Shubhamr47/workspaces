//Take an array of names as input from the user and print them on the screen.


package array;

import java.util.*;

public class array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        String names[] = new String[size];

        // input the size of array and print the number 
        for (int i = 0; i < size; i++) {
            System.out.print((i+1)+" Enter your name :");
            names[i] = sc.next();
        }

        // output
        for (int i = 0; i < names.length; i++) {
            System.out.println("name " + (i + 1) + " is : " + names[i]);
        }
        sc.close();
    }

}
