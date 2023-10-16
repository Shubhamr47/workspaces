package Sorting_Algorithams;

//import java.util.*;
public class Bubble_sort {

    public static void bubble(int arr[]) {
        // System.out.println("Bubble_sort.bubble()");
        for (int turn = 0; turn <= arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn;) {
                // System.out.println("alpha");
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    // System.out.println("alpha");
                }
            }
        }
    }

    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            // System.out.println("Bubble_sort.printarr()");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 5, 7, 4, 9, 5, 4 };
        Bubble_sort(arr);
        printarr(arr);
    }

    private static void Bubble_sort(int[] arr) {
    }
}
