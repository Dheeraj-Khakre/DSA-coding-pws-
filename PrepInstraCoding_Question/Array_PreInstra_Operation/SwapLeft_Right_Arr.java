/*
 Rotation of element of array – left and right
In this program we’ll be learning about Java program for rotation of elements 
of array- left and right to a specified number of times.
An array is said to be right rotated if all the selected elements were  moved towards right by one position.
 */
package PrepInstraCoding_Question.Array_PreInstra_Operation;



public class SwapLeft_Right_Arr {

   public static void main(String[] args)
    {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70};
        int n = arr.length;
        int k = 3;
        
        int[] temp;
         
        temp =  new int[n];
        
       System.arraycopy(arr, 0, temp, 0, k);
    
        int x = k;
        for(int i=0; x < n; i++){
            arr[i] = arr[x++];
        }
        
        x = 0;
    
        for(int i=n-k; i<n; i++)
            arr[i] = temp[x++];
    
   
        for (int i = 0; i < 7; i++)
            System.out.print(arr[i] + " ");
    }
}
