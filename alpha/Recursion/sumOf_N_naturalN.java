package Recursion;

public class sumOf_N_naturalN {
    public static void SumOfNaturalNumber(int n , int i, int sum){
        if (i==n) {
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        SumOfNaturalNumber(n, i+1, sum);
    }
    public static void main(String[] args) {
        SumOfNaturalNumber(4, 1, 0);
    }
}
