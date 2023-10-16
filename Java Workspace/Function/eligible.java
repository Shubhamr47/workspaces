package Function;

// import java.util.*;

// public class eligible {
//     public static int eligible(int a ){
//         return a;
//     }
//     public static void main(String args[]) {

//         Scanner scan = new Scanner(System.in);
//         System.out.println("Enter your age");
//         int age = scan.nextInt();
//         if (age <= 23) {
//             System.out.println("Sorry! you are not eligible wait for some time ");
//         } else {
//             System.out.println("hey , Now your are eligible for the vote, have a nice day!");
//         }
//         System.out.println(age);
//         scan.close();

//     }
// }

import java.util.*;
public class eligible {
public static boolean isElligible(int age) {
if(age > 18) {
return true;
}
return false;
}
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
int age = sc.nextInt();
System.out.println(isElligible(age));
sc.close();
}
}

// import java.util.*;
// public class eligible{
//     public static boolean isElligible(int age){
//         if(age>18){
//             return true;
//         }
//         return false;
//     }
//     public static void main(String args[]){
//         Scanner age=new Scanner(System.in);
//         int age1=age.nextInt();
//         System.out.println(isElligible(age));
//         age.close();
//     }
// }

