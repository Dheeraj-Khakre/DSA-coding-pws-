
package Array_DSA;

import java.awt.Color;


public class StockBuySell {
    public static void buysellStock(int price[]){
        int buy=Integer.MAX_VALUE,maxpro=0;
        for(int i=0;i<price.length;i++){
            if(buy<price[i]){
                int profit= price[i]-buy; 
                maxpro=Math.max(profit, maxpro);
            }else{
                buy=price[i];
                       
            }
        }
        System.out.println("maximum profite "+maxpro);
    }
    public static void main(String[] args) {
        int price[]={7,1,4,2,6,9,3};
        buysellStock(price);
    }
    
}
