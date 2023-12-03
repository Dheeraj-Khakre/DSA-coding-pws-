/*
 *
Java program to find the frequency of each element in the array
Methods Discussed are :
Objective: Java Program to find the Frequency of each element in the Array.

Method 1 : Using Naive Approach with extra space.
Method 2 : Naive way without extra space.
Method 3 : Using Sorting
Method 4 : Using hash Map
 */
package PrepInstraCoding_Question.Array_PreInstra_Operation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FrequencyArr {
    /// hashMap  
    public static void findFre_byHashMap(int arr[]){
        HashMap<Integer,Integer> hm=new HashMap<>();
       
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i])+1);
            }else{
                hm.put(arr[i], 1);
                       
            }
        }
        for(Map.Entry<Integer,Integer>entry:hm.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
        
                
    }

    //using sorting 
    public static void findFre_Sorting(int arr[]) {
        int cout = 1;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int cur = arr[i];
            while (i < arr.length - 1 && cur == arr[i + 1]) {
                i++;
                cout++;
            }
            if (cout > 1) {
                System.out.println(cur + " frequency " + cout);
            }

            cout = 1;
        }

    }
///Method 1 : Using Naive Approach with extra space.

    public static void findFrequency(int arr[]) {
        int visit[] = new int[arr.length];
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            if (visit[i] == 1) {
                continue;
            }
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visit[j] = 1;
                    count++;
                }
            }

            if (count > 1) {
                System.out.println(arr[i] + " count " + count);
            }
            count = 1;
        }

    }

    public static void main(String args[]) {
        // TODO code application logic here
        int arr[] = {10, 10, 20, 30, 20, 30, 10, 40, 40, 40};
        findFrequency(arr);
        System.out.println("sorting approach");
        findFre_Sorting(arr);
        findFre_byHashMap(arr);
    }
}
