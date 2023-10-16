import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        int s;
        float b;
        String n;

        Scanner in =new Scanner(System.in);

        System.out.println("Enter the string valu");
        n=in.nextLine();
        System.out.println("you entered the string value "+n);


        System.out.println("Enter the integer value");
        s=in.nextInt();
        System.out.println("you entered the integer value "+s);

        // System.out.println("Enter the string valu");
        // n=in.nextLine();
        // System.out.println("you entered the string value "+n);

        System.out.println("Enter the float valu");
        b=in.nextFloat();
        System.out.println("you entered the float value "+b);
        in.close();
    }
}
