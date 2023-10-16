package Function;
import java.util.*;

public class greater_number {
    static void greater_number(){
        System.out.println("Enter first number :");
        Scanner sc = new Scanner (System.in);
        int i =sc.nextInt();
        System.out.println("Enter Second number :");
        int j= sc.nextInt();
        if(i>j){
            System.out.println(i);
        }
        else
        System.out.println(j);
        sc.close();
    }
    public static void main(String[]args){
        greater_number();

    }
}
