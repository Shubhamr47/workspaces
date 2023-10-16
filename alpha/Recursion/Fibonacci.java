// package Recursion;

// public class fabnocci {
//     public static int getFactoliral(int n){
//         if (n==0) {
//             return 0;
//         }
//         if (n==1) {
//             return 1;
//         }
//         return getFactoliral(n-1) + getFactoliral(n-2);
//     }
//     public static void main(String[] args) {
//         //int n;
//         System.out.println(getFactoliral(9));
//     }
// }


package Recursion;

public class Fibonacci {
    public static int getFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return getFibonacci(n - 1) + getFibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(getFibonacci(9)); // This will print the 9th Fibonacci number.
    }
}

