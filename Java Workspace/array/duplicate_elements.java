// package array;
// //import java.util.Scanner;
// public class duplicate_elements {
//     public static void main(String[]args){

//         //Initize array
//         int[]arr=new int[]{1,2,3,4,5,6,7,8,8,3};

//         System.out.println("Duplicate elements in given array:");

//         //Searches for duplicate element
//         for(int i=0;i<arr.length;i++){
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[i]==arr[j])
//                 System.out.println(arr[j]);
//             }
//         }
//    }
//}

// package array;
// import java.util.*;
// public class duplicate_elements{

//     public static void main(String args[]){

//         //initize array
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the size of array :");
//         int size = sc.nextInt();
//         // int []=new int[size];
//         int names[] = new int[size];

//         System.out.println("Duplicate elements in given array:");

//         //Searches for duplicate element
//         for(int i=0;i<size;i++){
//             for(int j=i+1;j<size;j++){
//                 if(names[i]==names[j])
//                 System.out.println(names[j]);
//             }
//         }
//         sc.close();
//     }
// }

package array;

import java.util.*;

public class duplicate_elements {

public static int find(int[]arr , int n , int m){
    //write your code here
    int ans = Integer.MAX_VALUE;

    Arrays.sort(arr);

    for(int i=0; i<=n-m;i++){   // there is no ; after n its added becouse error is ocuring
        int minw = arr[i];
        int maxw = arr[i+m-1];
        int gap = maxw - minw;
        if(gap<ans){
            ans = gap;
        }
    }
        return 0;
}

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // input work

        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int m = scn.nextInt();
        int ans = find(arr,n,m);

        System.out.println(ans);
        scn.close();
    }
    //sc.close();
}
