/*
Count distinct element in an array in Java
In this section, we will learn, how to Count distinct element in an array in java language.

Given an integer array, we have to print all the distinct element of the input array. input array may contain duplicate elements, we have to print the count of distinct elements.
 */
package PrepInstraCoding_Question.Array_PreInstra_Operation;

import java.util.HashMap;
import java.util.HashSet;

public class DistrictElement_Array {

    // by using HashMap dsa O(n)
    public static int countDistr_HM(int arr[]) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        HashSet<Integer> hs=new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            hs.add(arr[i]);
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }
        System.out.println(hs.size());
        return hm.size();
    }
    /// by using loop iterator  O(n^2);

    public static int countDistr(int arr[]) {
        int count = 0;
        boolean visit[] = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (visit[i] == true) {
                continue;
            }
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visit[j] = true;
                }
            }
            count++;
        }
        return count++;
    }

    public static void main(String args[]) {
        // TODO code application logic here
        int arr[] = {10, 20, 30, 40, 50, 10, 20, 30};
        System.out.println(countDistr(arr));
        System.out.println(countDistr_HM(arr));
    }

}
