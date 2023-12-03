/*
 
Maximum product of sub-array in Java
Here, in this page we will discuss the program to find the maximum product of sub-array in java programming language. We are given with an integer array and need to print the value of maximum product that obtained.
 */
package PrepInstraCoding_Question.Array_PreInstra_Operation;


public class MaxProduct_SubArr {

   
    public static void max_product(int arr[]){
         int result = arr[0];
        int n = arr.length;
 
        for (int i = 0; i < n; i++)
        {
            int mul = arr[i];
            // traversing in current subarray
            for (int j = i + 1; j < n; j++)
            {
                // updating result every time
                // to keep an eye over the
                // maximum product
                result = Math.max(result, mul);
                mul *= arr[j];
            }
            // updating the result for (n-1)th index.
            result = Math.max(result, mul);
        }
        System.out.println(" "+result);
    }
    public static void main(String args[]) {
        // TODO code application logic here
         int arr[] = { 10, -20, -30, 0, 70, -80, -20 };
         max_product(arr);
    }
}
