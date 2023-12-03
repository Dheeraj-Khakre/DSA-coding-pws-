
package Array_DSA;

import java.util.Arrays;

public class Chocolate_Distribution {
  
    
    public static int chocolateDis(int arr[],int m){
        int min_diff=Integer.MAX_VALUE;
        if(arr.length==0 ||m==0)
            return 0;
        Arrays.sort(arr);
        if(arr.length<m)
            return -1;
        for(int i=0;i+m-1<arr.length;i++){
            int diff=arr[i+m-1]-arr[i];
            if(diff<min_diff){
                min_diff=diff;
            }
        }
        return min_diff;
    }
    public static void main(String[] args) {
      //  int arr[]={7,3,2,4,9,12,56,1};
        int arr[]={12,4,7,9,2,23,25,41,30,40,28,42,30,44,48,43,50};
        
        System.out.println(""+chocolateDis(arr, 7));   
      //  System.out.println(""+chocolatediss2(arr, 7));   
    }
    
}
