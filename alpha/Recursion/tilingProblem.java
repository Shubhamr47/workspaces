package Recursion;

public class tilingProblem {
    public static int tilingProblemss(int n){
        if(n == 0 || n == 1){
            return 1;
        }

        //vertical choice
        int fnm1 = tilingProblemss(n-1);

        //horizontal choice
        int fnm2 = tilingProblemss(n-2);

        int toWays = fnm1+fnm2;
        return toWays;
    }

    public static void main(String[] args) {
        System.out.println(tilingProblemss(5));
    }
}
