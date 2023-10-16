package Array;
public class twiceArray {
    private static int[] arr;
    public static int twiceArrayOrNot(int arr[],int target){
        int lo=0;
        int hi=arr.length-1;

        while(lo<=hi){
            int mid = (lo + hi)/2;

            if(arr[mid]==target){
                return mid;
            }
            else if(arr[lo] <= arr[mid]){
                //lo to mid is sorted
                if(target >= arr[lo]&& arr[mid]>target){
                    hi = mid - 1;
                }
                else{
                    lo = mid +1;
                }
            }
            else if(arr[mid] <= arr[hi]){
                //mid to hi part is sorted
                if(target > arr[mid] && arr[hi] >= target){
                    lo=mid+1;
                }
            }
        }
        return -1 ;
    }
    public static void main(String[] args) {
        int arr[] = {5,6,4,3,7};
        System.out.println(twiceArrayOrNot(arr, 0));
    }
}



//ERROR    
