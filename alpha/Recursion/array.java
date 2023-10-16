package Recursion;
import java.util.*;
public class array {
    public static boolean isSorted(int arr[], int i){
        if(i == arr.length-1){
            return true;
        }

        if (arr[i] > arr[i+1]) {
            return false;
        }

        return isSorted(arr, i+1);
    }

    public static void main(String[] args) {
        int arr[] = {2,49,5,7,8,9};
        isSorted(arr, 0);

        if (isSorted(arr, 0)) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }
}
