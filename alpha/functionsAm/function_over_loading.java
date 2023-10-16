package functionsAm;

public class function_over_loading {
    //function to calclute 2 two number
    public static int sum(int a,int b){
        return a+b;
    }

    //function to calclute 3 number 
    public static int sum(int a , int b, int c){
        return a+b+c;
    }
    
    public static void main (String []args){
        System.out.println(sum(5,5));
        int b;
        System.out.println(sum(6,8,9));
    }

}
