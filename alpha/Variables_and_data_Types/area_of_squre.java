//import java.util.Scanner;
package Variables_and_data_Types;
import java.util.Scanner;
public class  area_of_squre {
    public static void main(String[] args) {
        //int area,a;
        int area;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the numbers to check the area of squre ");
        int side=sc.nextInt();
        area = side*side;
        System.out.println(area);
        sc.close();
    }
    //sc.close();
}
