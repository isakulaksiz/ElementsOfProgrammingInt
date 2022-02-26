package arrays;

import java.util.ArrayList;
import java.util.List;

public class BuyAndSellStock {
    public static double computeMaxProfit(List<Double> prices){
        double minPrice = Double.MAX_VALUE, maxProfit = 0.0;
        for(Double price: prices){
            maxProfit = Math.max(maxProfit, price - minPrice);
            minPrice = Math.min(minPrice, price);
        }

        return maxProfit;
    }
    public static void main(String[] args){
        List<Double> arrList = new ArrayList<Double>();
        arrList.add(0,310.0);
        arrList.add(1,310.0);
        arrList.add(2,275.0);
        arrList.add(3,260.0);
        arrList.add(4,260.0);
        arrList.add(5,230.0);
        arrList.add(6,230.0);
        arrList.add(7,230.0);
        System.out.println(computeMaxProfit(arrList));
    }
}
