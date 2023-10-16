package Recursion;

public class factorial {
    public static int factorialOfN(int n){
        if (n==1 || n==0) {
            return 1;
        }
        int factnm1=factorialOfN(n-1);
        int facOfN=n*factnm1;
        return facOfN;
    }
    public static void main(String[] args) {
        System.out.println(factorialOfN(6));
    }
}
