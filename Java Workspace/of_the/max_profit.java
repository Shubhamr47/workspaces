package of_the;

public class max_profit {
    public static void main(String args[]){
    int maxprofit(int []a){
        int maxprifit = 0;
        int minsofar = a[0];
    }
    for(int i=0;i<a.length;i++){
        minsofar = math.min(minsofar,a[i]);
        int profit = a[i] - minsofar;
        maxprofit = math.max(maxprofit,profit);
    }
    return maxprofit;
}
}
