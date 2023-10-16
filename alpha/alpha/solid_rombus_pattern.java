package alpha;

public class solid_rombus_pattern {
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
public static void main(String[] args) {
    solid_roumbus(7);
}
}
