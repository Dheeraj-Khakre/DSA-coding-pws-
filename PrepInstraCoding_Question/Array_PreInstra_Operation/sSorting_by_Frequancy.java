/*
Sorting element in array by frequency in Java
Here in this program, we will learn about Java program for Sorting element in array 
by frequency in java and discuss it. You need to print the elements of an array in 
the descending order of their frequency and if 2 numbers have same frequency 
then print the one which came first.
 */
package PrepInstraCoding_Question.Array_PreInstra_Operation;

import java.util.HashMap;
import java.util.Map;

public class sSorting_by_Frequancy {

    public static void Sorting_Freq_HashMap(int arr[]) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }
        int newarr[]=new int[arr.length];
       int max =0;
       for(Map.Entry<Integer,Integer>e:hm.entrySet()){
           
       }
       

    }

    public static void main(String args[]) {

        int arr[] = {10, 20, 30, 40, 10, 20, 30, 30, 20, 40, 10};

    }
}
