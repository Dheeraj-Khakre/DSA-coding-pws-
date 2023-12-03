/*
 Sort an array according to the order defined by the other array
Here we will learn about Java program to Sort an array according to the order defined by another array which is discussed over here. 
We are given two arrays A [] and B [], sort A in such a way that the relative order among the elements will be the same as those are in B.
The elements in array A has to be printed accordingly to the sequence of order of elements specified in array B,
the rest of the elements,
remaining in array A are printed at the en
 */
package PrepInstraCoding_Question.Array_PreInstra_Operation;

import java.util.HashMap;
import java.util.*;

public class SortingArr_AnotherArr {

    public static void sortingByAntherARR(int arr1[], int arr2[]) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            if (hm.containsKey(arr1[i])) {
                hm.put(arr1[i], hm.get(arr1[i]) + 1);
            } else {
                hm.put(arr1[i], 1);
            }
        }
//        int[] tmp= Arrays.stream(arr1).boxed().sorted((p1, p2) -> {
//                      int idx1 = hm.getOrDefault(p1, 0);
//                      int idx2 = hm.getOrDefault(p2, 0);
// 
//                      if (idx1 == 0 && idx2 == 0)
//                          return p1 - p2;
// 
//                      if (idx1 == 0)
//                          return 1;
// 
//                      if (idx2 == 0)
//                          return -1;
// 
//                      return idx1 - idx2;
//                  }).mapToInt(i -> i).toArray();
//        System.out.println(Arrays.toString(tmp));

      
       
        int a = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (hm.containsKey(arr2[i])) {
                for (int j = 0; j < hm.get(arr2[i]); j++) {
                    arr1[a++] = arr2[i];
                }
            }
        }
        int i = 0;
        for (Map.Entry<Integer, Integer> e : hm.entrySet()) {
            if (i < arr2.length && hm.containsKey(arr2[i++])) {
                  
            } else {
                for (int k = 1; k <= e.getValue(); k++) {
                    arr1[a++] = e.getKey();
                }
            }

        }
       
        
    }

   
    

    public static void main(String args[]) {
        // TODO code application logic here
        int arr1[] = {1, 2, 3, 4, 3, 2, 4, 2, 5, 5};
        int arr2[] = {4, 2, 1, 3};
      //  print(arr2);
        System.out.println();
        sortingByAntherARR(arr1, arr2);
      System.out.println(Arrays.toString(arr2));
      System.out.println(Arrays.toString(arr1));
    }
}
