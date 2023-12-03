/*
Find Largest element in an array : C | C++ | Java | Python
Find Smallest Element in an Array : C | C++ | Java | Python
Find the Smallest and largest element in an array : C | C++ | Java | Python
Find Second Smallest Element in an Array : C | C++ | Java | Python
Calculate the sum of elements in an array : C | C++ | Java | Python
Reverse an Array 
 */
package PrepInstraCoding_Question;

import java.util.Scanner;

public class Array_Operation {

    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length / 2; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = arr.length - 1; i >= arr.length / 2; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void largestEle_Arr(int arr[]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            max = Math.max(arr[i], max);
            min = Math.min(arr[i], min);
        }

        System.out.println(" min " + min);
        System.out.println(" max " + max);
        System.out.println("sum of array " + sum);
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    public static void secondLargArr(int arr[]) {
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max);
        }
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != max && arr[i] > max2) {
                max2 = arr[i];
            }
        }

        System.out.println("max " + max);
        System.out.println(" second ma ele " + max2);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        
        largestEle_Arr(arr);
        secondLargArr(arr);
        bubbleSort(arr);
        System.out.println("");
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
