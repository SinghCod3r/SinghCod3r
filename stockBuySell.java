
public class stockBuySell{
    public static void main(String args[]){
        int[] arr = {7,1,5,3,6,4};
        int maxProfit = 0;
        int minValue = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            minValue = Math.min(minValue, arr[i]);
            int Profit = arr[i] - minValue;
            maxProfit = Math.max(maxProfit, Profit);
        }
        System.out.println(maxProfit);
    }
}