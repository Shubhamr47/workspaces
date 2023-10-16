package of_the;

import java.util.*;

public class ave {
   public static void main(String args[]){ 
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number to find the average of the given number:  ");
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      System.out.println("The average of given number is :");
      int av = (a + b + c) / 3;
      System.out.println(av);
      sc.close();

   }// input.close();
}
