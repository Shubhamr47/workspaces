//Command Line Argument in java

package javabasic;

public class Arguments {
    public static void main(String args[]) {

        // for (String t : args) {
        // System.out.println(t);

        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum = sum + Integer.parseInt(args[i]);
        }
        System.out.println("Sum is " + sum);
    }
}
