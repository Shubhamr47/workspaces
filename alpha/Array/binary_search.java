package Array;

public class binary_search {
    public static int binarySearch(int number[],int key){
        int start = 0,end = number.length - 1;

        while (start <= end){
            int mid = (start+end)/2;
            if (number[mid]==key) {
                return mid;
            }
            if (number[mid]<=key) {
                start = mid+1;
            }
            else {
                end = mid- 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number [] = {4,56,67,78,89};
        int key = 56;

        System.out.println("index for key is : " +binarySearch(number, key));
    }
}
