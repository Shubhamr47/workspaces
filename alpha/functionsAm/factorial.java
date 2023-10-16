package functionsAm;

public class factorial {
    public static int findFactorial(int n) {
        int f=1;
        for(int i=f;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        System.out.println(findFactorial(7));
    }
}


