package Sorting_Algorithams;
import java.util.Arrays;
public class inbuld_sort {
    public static void printarr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={5,4,6,4,7,2,8,5,3,8};
        Arrays.sort(arr, 0, 6);
        System.out.print(arr);
        printarr(arr);
    }
}
