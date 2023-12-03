//Maximum and minimum of an array using minimum number of comparisons
package Array_DSA;

import java.util.Arrays;


public class Maximum_Minimum_Element_Array {
     public static void minMax(int[] arr,int n){
          Arrays.sort(arr);
          int min=arr[0];
          int max=arr[n-1];
          System.out.println("maximun value in array is = "+max );
       System.out.println("minimun value in array is = "+min );
       }
    public static void main(String[] args) {
      int y[]={10,2,255,4,1,3,544,5,0,55,-520};
        minMax(y, x.length);
        
//        int x[]=new int[10]; 
//        int min=Integer.MAX_VALUE;
//        int max=Integer.MIN_VALUE;
//        Scanner sc =new Scanner(System.in);
//        for(int i=0;i<x.length;i++){
//            x[i]=sc.nextInt(); 
//            if(x[i]>max){
//                max=x[i];  
//            }
//            if(x[i]<min){
//                min=x[i];
//            }
//        }
//        System.out.println("maximun value in array is = "+max );
//        System.out.println("minimun value in array is = "+min );
    }
  
}

