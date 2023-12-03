/*
 * 
ar[]=[1,2,2,2,3,1]
output =1;
2=3time;
1=2time;
3=1time;
 */
package TCS_NQT_Question;

import java.util.HashMap;



public class Arrayfriquany {

   public static void arrFriq(int arr[]){
       int map[]=new int[arr.length];
       for(int i=0;i<arr.length;i++){
           map[arr[i]]=map[arr[i]]+1;
           
       }
       for(int i=0;i<map.length;i++){
           if(map[i]!=0){
               if(map[i]%2==0){
               System.out.println("even no. of foor  "+i);
               return;
           }
           }
           
       }
       System.out.println("-1");
       
       
   }
   public static void hashmap(int arr[]){
    HashMap    hm = new HashMap<Integer>();
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
        arrFriq(arr);
     //   hashmap(arr);
    }
}
