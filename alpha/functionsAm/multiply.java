package functionsAm;
import java.util.*;
public class multiply {
    public static int multiplyss(int a,int b){
        int product = a*b;
        return product;
    }
    public static void main(String[] args) {
        int a=3;
        int b=5;
        int prod = multiplyss(a,b);
        System.out.println("a*b="+prod);
    }
}
