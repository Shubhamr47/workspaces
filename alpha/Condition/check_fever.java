package Condition;
//import java.util.Scanner;
public class check_fever {
    public static void main(String[] args) {
        // System.out.println("Enter your temperachur to check fever or not");
        // Scanner sc=new Scanner (System.in);
        // double temp=sc.nextDouble();
        double temp = 99.5;
        if (temp>=100) {
            System.out.println("you have a fever");
        }
        else
        {
            System.out.println("you dont have a fever");
        }
    }
}
