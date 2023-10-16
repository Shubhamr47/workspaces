package Recursion;

public class calcPowerOpti {
    public static int calcPower(int x,int n){
        if (n==0) {
            return 1;
        }
        if (x==0) {
            return 0;
        }
        if (n%2==0) {
            return calcPower(x, n/2) * calcPower(x, n/2);
        }else{return calcPower(x, n/2) * calcPower(x, n/2)*x;}
    }
    public static void main(String[] args) {
        int x=5;
        int n=2;
        System.out.println(calcPower(x, n));
    }
}
