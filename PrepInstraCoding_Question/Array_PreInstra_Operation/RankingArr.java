/*
 Replace each element by its rank given in array
Here in this program we will learn about Java Program to replace each element by its rank in the given array and discussed it.
Given an array of distinct integers, we need to replace each element of the array with its rank. 
The minimum value element will have the highest rank in the Array.
 */
package PrepInstraCoding_Question.Array_PreInstra_Operation;

import java.util.*;

public class RankingArr {

    // using naive Approach 
    public static int[] rankArr(int arr[]) {
        int rank[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] >= arr[j]) {
                    rank[i] += 1;
                }
            }
        }
//        for(int i:rank){
//            System.out.print(i+" ");
//        }
        return rank;
    }

    // using HashMap 
    public static int[] rankArr_HM(int arr[]) {

        int n[] = Arrays.copyOfRange(arr, 0, arr.length);
        Arrays.sort(n);
        int a = 1;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n.length; i++) {
            if (!hm.containsKey(n[i])) {
                hm.put(n[i], a++);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i])) {
                arr[i] = hm.get(arr[i]);
            }
        }
        return arr;
    }

    public static void main(String args[]) {

        int arr[] = {100, 2, 70, 12, 59};
        int a[] = rankArr(arr);
        System.out.println("brootforce approach");

        System.out.println(Arrays.toString(a));
        System.out.println("hash map ans");
        a = rankArr_HM(arr);
        System.out.println(Arrays.toString(a));
    }
}
