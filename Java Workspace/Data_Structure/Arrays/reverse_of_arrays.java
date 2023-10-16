package Data_Structure.Arrays;

//import java.util.*;
public class reverse_of_arrays {
    // program to reverse an arrays
    public static void main(String[] args) {
        int[] array1 = new int[] { 1, 3, 5, 8, 4, 2 };
        System.out.println("the original arrays is :");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        System.out.println("the reverse of arrays is : ");
        for (int i = array1.length - 1; i >= 0; i--) {
            System.out.print(array1[1] + " ");
        }
    }
}
