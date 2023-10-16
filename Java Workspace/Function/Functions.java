package Function;
import java.util.*;
public class Functions{
    //multiply 2 number
    public static int multiply(int a , int b){
        return a*b;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        System.out.println("Enter a number");
        int b=sc.nextInt();

        int result=multiply(a,b);
        System.out.println(  result);
        sc.close();
    }
}  