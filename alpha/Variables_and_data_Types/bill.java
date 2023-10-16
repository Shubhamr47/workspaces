package Variables_and_data_Types;
import java.util.Scanner;
public class bill {
    public static void main(String[] args) {
        System.out.println("Enter the product prise for the bill:");
        //float add,total;
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();  
        float eraser = sc.nextFloat();  
        float sharpener = sc.nextFloat();  
        float add=pencil+eraser+sharpener;
        float total = add + (0.18f*add);
        System.out.println("total bill including GST is : " + total);
        sc.close();
    }
}
