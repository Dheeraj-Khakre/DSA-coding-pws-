/*
 Equilibrium index of an array in Java
Here we will learn about Java program to find Equilibrium index of an array in java , it is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.

Sum of elements at lower indexes = Sum of elements at higher indexes.
 */
package PrepInstraCoding_Question.Array_PreInstra_Operation;

public class Equilibrium_Index_Arr {

    public static int equilibriumIdx(int arr[]) {
        int sum = 0, lastsum = 0;
        for (int i : arr) {
            sum += i;
        }
        for (int i = 0; i < arr.length; i++) {
            sum -= arr[i];
            if (lastsum == sum) {
                return i;
            }
            lastsum += arr[i];
        }
        return -1;
    }

    public static void main(String args[]) {
        // TODO code application logic here
         int arr[] = { -1,2,0,4,-5,1,3,2,-4 };
         System.out.println("Equilibrium idx "+equilibriumIdx(arr));
    }
}
