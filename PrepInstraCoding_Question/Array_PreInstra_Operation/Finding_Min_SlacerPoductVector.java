/*
 Minimum scalar product of two vectors
In this section we will discuss the program to find the minimum scalar product of two vectors using java. We are given with two integer arrays and need to find the minimum scalar product obtained.
Example
Input :arr1[4] = [10, 30, 40, 20]
            arr2[4] = [2, 4, 5, 1]
Output : 230
Explanation : 10*5 + 20*4 + 30*2 + 40*1 = 230
 */
package PrepInstraCoding_Question.Array_PreInstra_Operation;

import java.util.Arrays;
import java.util.Comparator;

public class Finding_Min_SlacerPoductVector {
    
    public static  int min_ScalerVectorProduct(Integer v1[], Integer v2[]){
        Arrays.sort(v1);
        Arrays.sort(v2,Comparator.reverseOrder());
        int minProduct=0;
        for(int i=0;i<v1.length;i++){
            minProduct+= v1[i]*v2[i];
        }
        return minProduct;
    }
     // maximum scaler product of two vector
    public static  int mex_ScalerVectorProduct(Integer v1[], Integer v2[]){
        Arrays.sort(v1);
        Arrays.sort(v2);
        int minProduct=0;
        for(int i=0;i<v1.length;i++){
            minProduct+= v1[i]*v2[i];
        }
        return minProduct;
    }
    public static void main(String args[]) {

       Integer vector1[] = {1, 2, 6, 3, 7};
        Integer vector2[] = {10, 7, 45, 3, 7};
        System.out.println(" minmum Scaler vector product of two array "+min_ScalerVectorProduct(vector1, vector2));
        System.out.println(" maximum Scaler vector product of two array "+mex_ScalerVectorProduct(vector1, vector2));
    }
}
