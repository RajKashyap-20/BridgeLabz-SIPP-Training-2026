public class BubbleSortProductPrices {
    public static void bubbleSort(long[] prices){
        int n = prices.length;
        for(int i=0;i<n-1;i++){
            boolean swapped = false;
            for(int j=0;j<n-i-1;j++){
                if(prices[j] > prices[j+1]){
                    long temp = prices[j];
                    prices[j] = prices[j+1];
                    prices[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
    }
}