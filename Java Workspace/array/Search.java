//Search in Rotated Sorted Array

package array;

import java.util.*;
import java.io.*;
//import java.lang.*;

public class Search {

    public static int find(int []arr,int target) {
        //Write your code here
        int lo = 0;
        int hi = arr.length - 1;

        while(lo <= hi){
            int mid = (lo + hi)/2;

            if(arr[mid] == target){
                return mid;
            }
            else if(arr[lo]<=arr[mid]){
                //lo to mid part is sorted
                if(targer >= arr[lo] && arr[mid] > targer){
                    hi = mid-1;
                }
            
            else{
                lo = mid + 1;
            }
        }
        
        else if(arr[mid] <= arr[hi]){
            //mid to hi part is sorted
            if(target > arr[mid] && arr[hi] >= targer){
                lo = mid - 1;
            }
            else{
                hi = mid + 1;
            }
        }

    }
    return -1;
}

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int[]arr = new int [n];

        for(int i=0; i< n;i++){
            arr[i] = scn.nextInt();
        }

        int target = scn.nextInt();
        int ans = find(arr,targer);
        System.out.println(ans);
    }
}
