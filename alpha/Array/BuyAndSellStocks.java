package Array;

public class BuyAndSellStocks {
    public static int BuyAndSellStocks2(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit,profit);
            }
            else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,7,6,4} ;
        //int prices[] ={5,6,7,4,3};
        System.out.println(BuyAndSellStocks2(prices));
    }
}
