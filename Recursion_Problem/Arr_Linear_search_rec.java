package Recursion_Problem;

import java.util.ArrayList;
import java.util.Scanner;

public class Arr_Linear_search_rec {

    static Scanner sc = new Scanner(System.in);

    static int[] inputArr() {
        System.out.println("enter the size of arr");
        int arr[] = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    // linear searching return  true / false if key is eixt or not 

    static boolean linear_search(int arr[], int key, int i) {
        if (i == arr.length) {
            return false;
        }
        if (key == arr[i]) {
            return true;
        }
        return linear_search(arr, key, i + 1);
    }

    static int linear_Ind_search(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (key == arr[i]) {
            return i;
        }
        return linear_Ind_search(arr, key, i + 1);
    }

    static int linear_lastInd_search(int arr[], int key, int i) {
        if (i < 0) {
            return -1;
        }
        if (key == arr[i]) {
            return i;
        }
        return linear_lastInd_search(arr, key, i - 1);
    }

    // how much time occurance key
    static void occurance_Key(int arr[], int key, int i) {
        if (i == arr.length) {
            return ;
        }
        if (key == arr[i]) {
            System.out.println(i);
        }
         occurance_Key(arr, key, i + 1);
    }
    // return the all occranc of key 

    static ArrayList<Integer> key_Occurane1(int arr[], int key, int i) {
        if (i == arr.length) {
            return new ArrayList<>();
        }
        ArrayList<Integer> al = new ArrayList<>();
        if (key == arr[i]) {
            al.add(i);
        }

        al.addAll(key_Occurane1(arr, key, i + 1));
        return al;
    }

    public static void main(String args[]) {
       
        int arr[]=inputArr();
//        System.out.println(linear_Ind_search(arr, 5, 0));
//        System.out.println(linear_search(arr, 9, 0));
//        System.out.println(linear_lastInd_search(arr, 5, 0));
System.out.println("key occurance in array");

//occurance_Key(arr, 5, 0);
System.out.println(key_Occurane1(arr, 5, 0));
    }
}
