package BitManipulation;

public class OddOrEven {
    public static void odd_even(int n){
        int bitmask=1;
        if ((n&bitmask) == 0) {
            System.out.println("even number");
        }
        else
        System.out.println("odd number");
    }

    //Ith Bit int binary number
    public static int getIthBit(int n , int i){
        int bitmask = 1<<i;
        if ((n&bitmask)==0) {
            return 0;
        }
        else{
        return 1;
        }
    }
    //set Ith Bit in binery number
    public static int setIthbit(int n,int i){
        int bitmask=1<<i;
        return n|bitmask;
    }
    //clear ith bit in binery nember
    public static int clearIthBit(int n,int i){
        int bitmask=~(1<<i);
        return n&bitmask;
    }
    public static void main(String[] args) {
        // odd_even(7);
        // odd_even(9);
        // odd_even(8  );
       //System.out.println(getIthBit(10, 3));
       //System.out.println(setIthbit(6, 2));
        System.out.println(clearIthBit(8, 3));
    }
}
