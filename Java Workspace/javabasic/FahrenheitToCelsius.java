import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        float temperatue;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter temperatue is faharenheit");
        temperatue = in.nextInt();

        temperatue = ((temperatue - 32)*5)/9;

        System.out.println("temperature in celsius = "+ temperatue);
        in.close();
}
}
