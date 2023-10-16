package Function;

import java.util.*;

public class odd_even {
    static void odd_Function() {
        System.out.println("Enter the number to find the number is odd or even");
        Scanner reader = new Scanner(System.in);
        int i = reader.nextInt();
        if (i % 2 == 0) {
            System.out.println("yo yo likes odd");
        } else
            System.out.println("yo yo likes even");
        reader.close();
    }

    public static void main(String args[]) {
        odd_Function();
    }
}
