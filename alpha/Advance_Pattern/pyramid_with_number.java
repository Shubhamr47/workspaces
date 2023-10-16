package Advance_Pattern;

public class pyramid_with_number {
    public static void pyramid_with_number_class(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // public static void main(String[] args) {
    // pyramid_with_number_class(99);
    // }
    public static void floyds_triangle(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void one_zero_triangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n) {
        // outer looop
        for (int i = 1; i <= n; i++) {
            // outer part
            // innerloop for star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // for space
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd part
        for (int i = n; i >= 1; i--) {
            // outer part
            // innerloop for star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // for space
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void solid_roumbus(int n){
        for(int i=1;i<=n;i++){
            //for space
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                if (j==1||j==n||i==1||i==n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void dimend(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n;i>=1;i--){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // floyds_triangle(6);
        // one_zero_triangle(7);
        //butterfly(5);
        solid_roumbus(6);
        //dimend(6);
    }
}
