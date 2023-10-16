package Twod_arrays;
import java.util.*;
public class sprial_matrix {
    public static void printSprial(int matrix[][]){
        int startrow=0;
        int endrow=matrix.length-1;
        int startcol=0;
        int endcol=matrix[0].length;
        
        while (startrow<=endrow&& startcol<=endcol) {
            //upper loop
            for (int j = startcol; j <= endcol-1; j++) {
                System.out.print(matrix[startrow][j]+" ");
            }
            //right side loop
            for(int i = startrow+1;i<=endrow;i++ ){
                System.out.print(matrix[i][endcol-1]+" ");
            }
            //bottom
            for(int j=endcol-1;j>=startcol;j--){
                if (startrow==endrow) {
                    break;
                }
                System.out.print(matrix[endrow][j]+" ");
            }
            //left side loop
            for(int i=endrow-1;i>=startrow+1;i--){
                if (startcol==endcol) {
                    break;
                }
                System.out.print(matrix[i][startcol]+" ");
            }
            startcol++;
            startrow++;
            endcol--;
            endrow--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int matrix[][]={{1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16}};
        printSprial(matrix);
    }
    
}
