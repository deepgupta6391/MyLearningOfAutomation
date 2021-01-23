package java2blog;

public class StockBuySellMaxProfit {

	public static void main(String[] args) {
		int arr[] = { 14, 12, 70, 15, 99, 65, 21, 90 };
		int stockPrices[] = { 100, 120, 150, 200, 80, 50, 110, 150, 200, 210 };
		//System.out.println("Maximum profit :" + calculateMaxProfit(arr));
		System.out.println("Maximum profit :" + calculateMaxProfit(stockPrices));
		

	}

	public static int calculateMaxProfit(int[] arr) {
		int minStockPrice = arr[0];
		int maxStockPrice = arr[0];
		int profit = 0;
		for (int i = 1; i < arr.length; i++) {
			if (minStockPrice > arr[i]) {
				minStockPrice = arr[i];
				maxStockPrice = arr[i];
			} else if (maxStockPrice < arr[i]) {
				maxStockPrice = arr[i];
			}
		}
		
		profit=maxStockPrice-minStockPrice;
		System.out.println("Min stock price is : " + minStockPrice + " and max stock price is : " + maxStockPrice);

		return profit;
	}

}
