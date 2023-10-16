package Recursion;

public class calcPower {
    public static int calcThePower(int n,int x){
        if (n==0) {
            return 1;
        }
        if (x==0) {
            return 0;
        }
        int xPowernm1=calcThePower(n-1, x);
        int xPowern = x*(xPowernm1);
        return xPowern;
    }
    public static void main(String[] args) {
        int n=2, x=5;
        System.out.println(calcThePower(n, x));
    }
}
