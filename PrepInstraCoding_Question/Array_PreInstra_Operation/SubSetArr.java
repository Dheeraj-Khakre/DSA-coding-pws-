/*
 Array is a subset of another array in Java
In this section we will determine the program to find if an Array is a subset of another array in Java which is discussed here. If all the elements of array 2 are found in array 1, then array 2 is said to be a subset of array 1.

Array is subset of another array
Example
arr1 = {1,2,3,4,5}  , arr2 = {3,4,5}
arr2 is a subset of arr1 (As, arr1 contains all the elements of arr2)
arr3 = {1,2,3,4,5}   arr4 = {1,2,9}
arr4 is not a subset of arr3 (As, arr3 do not contains all the elements of arr4).
 */
package PrepInstraCoding_Question.Array_PreInstra_Operation;
import java.util.HashSet;

public class SubSetArr {

   
    public static boolean subsetArr(int arr1[], int arr2[]) {
        HashSet<Integer> hs= new HashSet<>();
       
        for(int i=0;i<arr1.length;i++){
            hs.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            if(!hs.contains(arr2[i])){
                return false;
            }
        }
        return true;
        
    }
    public static boolean canBeEqual(int[] arr) {
    int count2 = 0;
    int count3 = 0;
    for (int i : arr) {
        while (i % 2 == 0) {
            i /= 2;
            count2++;
        }
        while (i % 3 == 0) {
            i /= 3;
            count3++;
        }
    }
    return count2 == count3;
}

    public static void main(String args[]) {
        // TODO code application logic here
        int[] arr1 = {1,2,3,4,5}  , arr2 = {3,4,5};
        if(subsetArr(arr1, arr2)){
            System.out.println("arr2 is a subset of arr1 (As, arr1 contains all the elements of arr2)\n");
        }
        else{
            System.out.println("arr2 is not a subset of arr1 (As, arr1 do not contains all the elements of arr2).\n");
        }
         int arr[] = { 50, 100, 75 };
        if(canBeEqual(arr)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
