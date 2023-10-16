package Array;

public class sortedAndRotatedArray {
    public static int sortedAndRotatedArray2(int arr[],int key){
        int low = 0,high=arr.length;
        int mid = (low+high)/2;
        if (mid == key) return mid;
        if (arr[low]<arr[mid]) {
            if (key<arr[mid]&&key>arr[low]) {
                high=mid -1;
            }
        } else {
            high=mid+1;
        }
        
    }
    else{
        if (key > a(mid) && key < arr[high]) {
            
        }
    }
}
