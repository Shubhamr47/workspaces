package Array;
import java.util.*;
public class Array_Example2 {
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks[]={34,45,56,67};
        update(marks);

        for(int i=0;i<=marks.length;i++){
            System.out.println(marks[i]+" ");
        }
        System.out.println();
    }
}
