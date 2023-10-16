package Sorting_Algorithams;

public class insertionSort {
    public static void insertion_Sort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            int pre = i-1;
            //finding out the correct pos to insert the value
            while (pre>=0 && arr[pre]>curr) {
                arr[pre+1] = arr[pre];
                pre--;
            }
            //insertion
            arr[pre+1] = curr;
        }
    }
    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = { 9,8,7,4,2 };
        insertion_Sort(arr);
        printarr(arr);
    }
}
