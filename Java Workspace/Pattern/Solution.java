//import java.io.*;
import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;

public class Solution {
 public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();            
        String shu;
        if(n%2==1)shu = "Weird";
        else
        {
            if(n>=2 && n<=5)shu= "Not Weird";
            else if(n>=5 && n<=20)shu="Weird";
            else shu= "Not Weird";
        }
        System.out.println(shu);

    }
}
    