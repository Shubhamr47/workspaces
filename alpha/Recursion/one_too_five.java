package Recursion;

public class one_too_five {
    public static void onetoFive(int n){
        if (n==9) {
            return;
        }
        System.out.print(n);
        onetoFive(n+1);
    }
    public static void main(String[] args) {
        onetoFive(1);
    }
}
