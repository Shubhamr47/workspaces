package Array;

public class twiceArray2 {
    public static boolean twiceinArray(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
    int arr []= {4,5,7,3,};
    System.out.println(twiceinArray(arr));
    }
}
