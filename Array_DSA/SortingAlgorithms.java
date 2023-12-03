package Array_DSA;

import java.util.Collections;

public class SortingAlgorithms {

    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int t = 0;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    t = 1;
                }
            }
            if (t == 0) {
                break;
            }
        }
    }

    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int ele = i;
            for (int j = 1 + i; j < arr.length; j++) {
                if (arr[j] < arr[ele]) {
                    ele = j;
                }
            }
            int temp = arr[ele];
            arr[ele] = arr[i];
            arr[i] = temp;

        }
    }

    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int cur = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > cur) {
                arr[prev + 1] = arr[prev];
                prev = prev - 1;
            }
            arr[prev + 1] = cur;
        }
    }
//   public static void insertionSort(int[] arr) {
//        int n = arr.length;
//        for (int i = 1; i < n; i++) {
//            int key = arr[i];
//            int j = i - 1;
//
//            while (j >= 0 && arr[j] > key) {
//                arr[j + 1] = arr[j];
//                j = j - 1;
//            }
//            arr[j + 1] = key;
//        }
//    }

    ///mergSort 
    public static void margSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = (si + ei) / 2;
        margSort(arr, si, mid);
        margSort(arr, mid + 1, ei);
        marge(arr, si, mid, ei);

    }

    public static void marge(int arr[], int si, int mid, int ei) {
        int tepm[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                tepm[k] = arr[i];
                i++;
            } else {
                tepm[k] = arr[j];
                j++;
            }
            k++;

        }
        // left 
        while (mid >= i) {
            tepm[k++] = arr[i++];
        }
        while (j <= ei) {
            tepm[k++] = arr[j++];
        }
        //copy
        for (i = si, k = 0; k < tepm.length; k++, i++) {
            arr[i] = tepm[k];
        }

    }

    public static void quickSort(int arr[], int si, int ei) {
        if (si < ei) {

            int pivot = partition(arr, si, ei);
            quickSort(arr, si, pivot - 1);
            quickSort(arr, pivot + 1, ei);
        }
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;
        for (int j = si; j < ei; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }

        }
        i++;
        int temp = arr[i];
        arr[i] = arr[ei];
        arr[ei] = temp;
        return i;
    }

    public static void printArray(int arr[]) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    public static void main(String args[]) {
        // TODO code application logic here
        int arr[] = {1, 3, 6, 2, 5, 4, 7, 9, 8};
//        bubbleSort(arr);
//        printArray(arr);
        // selectionSort(arr);
        //  insertionSort(arr);
        //  margSort(arr, 0, arr.length-1);
        int n = arr.length - 1;
        quickSort(arr, 0, n);
        printArray(arr);
    }
}
