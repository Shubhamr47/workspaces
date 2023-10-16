package Function;

import java.util.*;

public class average_of_given_number {
    public static void main(String args[]) {
        System.out.println("Enter three no to find the average:  ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("the average of given number is :  ");
        int average = (a + b + c) / 3;
        System.out.println(average);
        sc.close();

    }
}
