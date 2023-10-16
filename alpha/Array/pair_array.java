package Array;
import java.util.*;
public class pair_array {
    public static void pair_arr(int number[]){
        for (int i = 0; i < number.length; i++) {
            int curr= number[i] ;
            for(int j=i+1;j<number.length;j++){
                //System.out.println("7667676767676776776");
                System.out.print("("+curr+","+number[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int number[] = {4,7,9,3,2,8, 1};
        pair_arr(number);
    }
}
