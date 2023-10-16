package Data_Structure.Arrays;

public class sum_of_min_max {
    public static void main(String args[]){
        int a[]={45 ,45 ,453,345,56,3454};
        int min=a[0];
        int max=a[0];
            for(int i=0;i<a.length;i++){
                if (a[i]>max)
                max=a[i];
                if(a[i]<min)
                min=a[i];
            }
            System.out.println("this is the max number of arrys: " +max);
            System.out.println("this is the min number of arrys: " +min);
            System.out.println("sum of max and min number is: " + (max+min));
    }
}
