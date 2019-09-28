public class Stocks {
    public static int maxProfit(int[] prices) {
        int min = prices[0], max = 0, tempMin = 0, tempMax = 0;
        for(int i = 0; i < prices.length; i++) {
            if(min > prices[i]) {
                min = prices[i];
            }
            if(max < prices[i]) {
                max = prices[i];
            }
        }

        for (int i = 0; i < prices.length ; i++) {
            if(prices[i] == min) {
                tempMin = i;
            }
            else if(prices[i] == max) {
                tempMax = i;
            }
        }

        prices[tempMin] = 0;
        prices[tempMax] = 0;

        return max - min;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

}
