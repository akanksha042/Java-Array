//time complexity O(n)

public class BuyAndSellStocks {


    public static int Stocks(int [] prices){
        int BuyPrice = Integer.MAX_VALUE;
        int MaxProfit = 0;
        for(int i=0; i< prices.length;i++){
            if(BuyPrice < prices[i]){
                int profit = prices[i] - BuyPrice; // today's profit
                MaxProfit = Math.max(MaxProfit, profit); //overall profit
            }
            else{
                BuyPrice = prices[i];
            }
        }
        return MaxProfit;
    }
    public static void main(String args[]){
        int [] prices = {7, 1, 5, 6,4};
        System.out.println(Stocks(prices));
        
    }
    
}
