package Array;
import java.util.*;
public class sum_of_sumArray {
    public static void subArrays(int number[]){
        int ts = 0;
        int curr=0;
        for (int i=0;i<number.length;i++){
            int start = i;
            for (int  j=i;j<number.length;j++){
                int end = j;
                curr=0;
                int maxSum=Integer.MIN_VALUE;
                for(int k=start;k<=end; k++){
                    //System.out.print(number[k] + " ");
                    curr += number[k];
                }
                System.out.println(curr);
                if (curr >maxSum) {
                    //System.out.println(curr);
                    maxSum=curr;
                }
                // ts++;
                // System.out.println();
                // int sum=0;
                // System.out.print(sum = ts);
                // System.out.println();
                System.out.println("max sum is "+ maxSum);
            }
            //System.out.println();
            //System.out.println(+ maxSum);
        }
        //System.out.println("total subarrays = " + maxSum);
    }
    public static void kadanes(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i=0;i< numbers.length;i++){
            cs = cs + numbers[i];
            if (cs<0) {
                cs = 0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println("our max sum arraySum is " +ms);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,4,-7,-3};
        kadanes(numbers);
    }
}
