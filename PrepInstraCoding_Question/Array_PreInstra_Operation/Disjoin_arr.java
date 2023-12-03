/*
 two array is disjoin or not 

 */
package PrepInstraCoding_Question.Array_PreInstra_Operation;

import java.util.HashSet;
public class Disjoin_arr {

    
    public static boolean disJoin_HS( int arr1[], int arr2[]){
        HashSet<Integer> hs =new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            hs.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            if(hs.contains(arr2[i])){
                return false;
            }
        }
        return true;
    }
    public static boolean disJoin( int arr1[], int arr2[]){
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String args[]) {
        // TODO code application logic here
        
        int arr1[] = {10, 51, 3, 43, 6};
        int arr2[] = {80, 71, 29, 3};
        
        if (disJoin(arr1, arr2))
            System.out.println("Yes");
        else
            System.out.println("No");
        if (disJoin_HS(arr1, arr2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
