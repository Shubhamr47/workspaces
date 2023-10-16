package functionsAm;
public class FOver_loading_UDataType {
    public static int sum(int a,int b){
        return a+b;
    }

    //function to calclute 3 number 
    public static float sum(float a , float b){
        return a+b;
    }
    
    public static void main (String []args){
        System.out.println(sum(5,5));
        System.out.println(sum(6.88f,9.56f));
    }
}
