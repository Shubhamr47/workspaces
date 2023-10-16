package functionsAm;

public class prime {
    public static Boolean isPrime(int n){
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    
    public static void primeInRange(int n) {
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.println(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        //System.out.println((7));
        //primeInRange(n:66);
        //primeInRange(n: 99);
        primeInRange(88);
    }
}
