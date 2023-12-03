/*
 Repeating element of an array in Java
In this section, we will learn the Program to Find Repeating element of an array in java.Given an array, print all element whose frequency is not equal to one. We will discuss different approaches to print the repeated elements of given input array.
 */
package PrepInstraCoding_Question.Array_PreInstra_Operation;

import java.util.HashMap;
import java.util.Map;

public class Reapiting_Elements {

    // by iterator appoach , O(n^2);
    public static void reapitingEle(int arr[]) {
        int count = 0;
        boolean vis[] = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (vis[i] == true) {
                continue;
            }
            count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    vis[j] = true;
                }
            }
            
            if(count!=1){
                System.out.print(arr[i]+" ");
            }
        }
    }
/// by using HashMap data Structure ...
    public static void reapitingEle_HM(int arr[]){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i])+1);
                
            }else{
                hm.put(arr[i], 1);
            }
        }
        for(Map.Entry<Integer,Integer>en:hm.entrySet()){
            if(en.getValue()>1){
                System.out.print(en.getKey()+" ");
            }
        }
        // non reapiting  elements .. .
        System.out.println("non reapiting elements ..");
         for(Map.Entry<Integer,Integer>en:hm.entrySet()){
            if(en.getValue()==1){
                System.out.print(en.getKey()+" ");
            }
        }
         //removing elements .. 
         System.out.println("removing duplicats ...");
          for(Map.Entry<Integer,Integer>en:hm.entrySet()){
            
                System.out.print(en.getKey()+" ");
            
        }
    }
    public static void main(String args[]) {
        // TODO code application logic here
        int arr[] = {10, 20, 30, 40, 50, 10, 20, 30};
        reapitingEle(arr);
        System.out.println("......");
        reapitingEle_HM(arr);

    }
}
