//Maximum and Minimum Element in an Array

package Data_Structure.Arrays;

import java.util.*;

public class Maximum_and_Minimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int number[] = new int[size];
        // input
        for (int i = 0; i < size; i++) {
            System.out.print((i+1) +" Enter the the number : ");
            number[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < number.length; i++) {
            if (number[i] < min) {
                min = number[i];
            }
            if (number[i] > max) {
                max = number[i];
            }
        }
        sc.close();
        System.out.println("Largest number is : " + max);
        System.out.println("Smallest number is : " + min);
    }

}