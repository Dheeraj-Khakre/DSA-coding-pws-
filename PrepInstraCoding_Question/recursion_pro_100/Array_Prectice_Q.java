package PrepInstraCoding_Question.recursion_pro_100;

import java.util.Arrays;

import java.util.Comparator;

public class Array_Prectice_Q {

//    Find Largest element in an array : C | C++ | Java | Python
//Find Smallest Element in an Array : C | C++ | Java | Python
    //Find the Smallest and largest element in an array : C | C++ | Java | Python
    public static void small_largest_Elm(int arr[]) {
        int lerg = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > lerg) {
                lerg = arr[i];
            }
            if (arr[i] < small) {
                small = arr[i];
            }
        }
        System.out.println("largest element " + lerg);
        System.out.println("smallest element " + small);
    }
    //Calculate the sum of elements in an array : C | C++ | Java | Python

//Find Second Smallest Element in an Array : C | C++ | Java | Python
    public static void second_Small(int arr[]) {
        // int lerg=Integer.MIN_VALUE;
        int s = Integer.MAX_VALUE;
        int SecondSm = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] < s) {
                s = arr[i];
            }
            if (arr[i] < SecondSm && SecondSm > s) {
                SecondSm = arr[i];
            }

        }
        System.out.println("smallest element " + s);
        System.out.println(" second smallest element " + SecondSm);
        System.out.println("sum of array " + sum);
        System.out.println("avarage of array " + sum / arr.length);
    }

//Reverse an Array : C | C++ | Java | Python
    public static void reverseArr(int arr[]) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        printArr(arr);
    }
//Sort first half in ascending order and second half in descending : C | C++ | Java | Python

    public static void bubbleSort(int arr[]) {
        for (int i=0; i < arr.length; i++) {
            boolean fleg = false;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    fleg = true;
                }
            }
            if (!fleg) {
                break;
            }
        }
       // printArr(arr);
    }
    public static void insertSort(int arr[]){
        for( int i=1;i<arr.length;i++){
            int cur=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]<cur){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=cur;
        }
    }

    public static void ascendind_Descending2(int arr[]) {
        Integer array[]=  new Integer[arr.length];
        for(int i=0;i<arr.length;i++){
            array[i]= Integer.valueOf(arr[i]);
        }
         
         Arrays.sort(array,Comparator.reverseOrder());
         for(int i=0;i<arr.length;i++){
             System.out.print(array[i]+" ");
         }
        Arrays.sort(array);
        System.out.println();
      for(Integer i:array){
          System.out.print(i+" ");
      }
       
    }
    public static void ascendind_Descending(int arr[]) {
        int asc[]=new int[arr.length/2];
        int desc[]=new int[arr.length/2];
        for(int i=0;i<arr.length/2;i++){
            asc[i]=arr[i];
            desc[i]=arr[arr.length/2+i];
        }
        bubbleSort(asc);
        insertSort(desc);
         for(int i=0;i<arr.length/2;i++){
            arr[i] = asc[i];
            arr[arr.length/2+i]=desc[i];
        }
         System.out.println("half ascending order and half descending order ");
        printArr(arr);
        System.out.println();
        System.out.println("sorted array");
        bubbleSort(arr);
        printArr(arr);
    }
//Sort the elements of an array

    public static void printArr(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = {1, 3, 2, 4, 5, 9};
     //  bubbleSort(arr);
      //  insertSort(arr);
      //  printArr(arr);
      ascendind_Descending2(arr);
    }
}
