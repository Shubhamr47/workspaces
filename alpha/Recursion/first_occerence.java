package Recursion;

public class first_occerence {
    public static int first_occer(int arr[], int i , int key){
        if (i >= arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }

        return first_occer(arr , i+1 , key);
    }
    public static void main(String[] args) {
        int arr[]={2,3,5,6,7,8};
        System.out.println(first_occer(arr, 0, 8));
    }
}
