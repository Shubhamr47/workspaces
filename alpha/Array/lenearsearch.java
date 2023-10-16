package Array;
import java.util.*;
public class lenearsearch {
    public static int lenear_search(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if (numbers[i]==key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={34,45,56,67,78,34,54,56,67,34,45,56,76,43}; 
        int key =43;

        int index=lenear_search(numbers, key);
        if (index==-1){
            System.out.println("not found");
        }
        else{
            System.out.println("key is index --->  "+index);
        }
    }
}
