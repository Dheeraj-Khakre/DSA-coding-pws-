/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package TCS_NQT_Question;

import java.util.HashMap;

/**
 *
 * @author hp
 */
public class DemoArr {

   public static void hashmap(int arr[]){
       HashMap<Integer>  hm;
       hm = new HashMap<Integer>();
       for(int i=0;i<arr.length;i++){
           hm.put(arr[i],hm.get(i)+1);
       }
       for(int i=0;i<hm.size();i++){
           if(hm.get(i)%2==0){
               System.out.println(hm.get(i));
           }
       }
       
   }
    
    public static void main(String args[]) {
        // TODO code application logic here
        int arr[]={1,2,2,3,1,1};
       // arrFriq(arr);
        hashmap(arr);
    }
}
