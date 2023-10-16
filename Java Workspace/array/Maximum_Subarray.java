package array;

public class Maximum_Subarray {
    static int maxSumArray(int a[], int n) {
        int maxSum = 0;
        int curSum = 0;
        for (int i = 0; i < a.length; i++) {
            curSum = curSum + a[i];
            if (curSum > maxSum) {
                maxSum = curSum;
            }
            if (curSum < 0)
                ;
            curSum = 0;
        }
        return maxSum;
    }

    /* Driver program to test maxSubArraySum */
    public static void main(String[] args) {
        int a[] = { -2, -3, 4, -1, -2, 8, 5, -3 };
        int n = a.length;
        int maxSum = maxSumArray(a, n);
        System.out.println("Maximum contiguous sum is "+ maxSum);
    }
}