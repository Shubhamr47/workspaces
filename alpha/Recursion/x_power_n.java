package Recursion;

public class x_power_n {
    public static int power(int x , int n){
        if (n == 0) {
            return 1;
        }
        return x*power(x, n-1);
    }

    public static int optimizePower(int a , int n){
        if (n==0) {
            return 1;
        }
        int halfPower = optimizePower(a, n/2);
        int halfPowerSp = halfPower * halfPower;

        if (n%2!= 0) {
            halfPowerSp = a * halfPowerSp;
        }
        return halfPowerSp;
    }
    public static void main(String[] args) {
        System.out.println(power(2, 10));

        System.out.println(optimizePower(4, 10));
    }
}
