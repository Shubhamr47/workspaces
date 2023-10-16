package functionsAm;

public class palindrome {
    public static int plndrm(int n){
        int s=0,c,r;
        c=n;
        while (n>0) {
            r=n%10;
            s=(s*10)+r;
            n=n/10;
        }
        if (c==s) {
            System.out.println("palindrome number");
        }
        else
        System.out.println("not palindrome number");
        return r;
    }
    public static void main(String[] args) {
        System.out.println(plndrm(55));
    }
}
