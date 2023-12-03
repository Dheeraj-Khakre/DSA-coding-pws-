package Recursion_Problem;

import java.util.Scanner;

public class RecursionOn_Arr {

    public static int[] inputArr() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of arr");
        int arr[] = new int[sc.nextInt()];
        System.out.println("enter value");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static void printArrRec(int arr[], int idx) {
        if (idx == arr.length) {
            return;
        }
        System.out.print(" " + arr[idx]);
        printArrRec(arr, idx + 1);
    }

    static int maxEle_arr(int arr[], int idx) {
        return idx == arr.length - 1 ? arr[idx] : Math.max(arr[idx], maxEle_arr(arr, idx + 1));
    }

    static int sumEle_arr(int arr[], int idx) {
        return idx == arr.length - 1 ? arr[idx] : arr[idx] + sumEle_arr(arr, idx + 1);
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5};
//        
//        printArrRec(inputArr(), 0);
//        System.out.println("max elemet in arr : "+maxEle_arr(inputArr(), 0));
//        System.out.println("summ of the arr : "+sumEle_arr(inputArr(), 0));
//System.out.println(countPath(3, 3, 0, 0));
        //   System.out.println(count);
        //  trianglePrintArr(arr);
   //     possible_Combination(arr, 4, 0);
   possible_com_It(arr, 0);

    }
    // assinmant 
    // Q1 - Count all the possible paths on an m x n grid from top left (grid[0][0]) to bottom right (grid[m-1][n-1]) 
    //having constraints that from each cell you can either move only to right or down.
    //  static int count = 0;

    static int countPath(int n, int m, int x, int y) {
        if (n - 1 == x && m - 1 == y) {
            return 1;
        } else if (n == x || m == y) {
            return 0;
        }

        return countPath(n, m, x + 1, y) + countPath(n, m, x, y + 1);

    }
////    
//    - Given an array of integers, print a sum triangle from it such that the first level(the bottom
//level in triangular fashion) has all array elements. From then, at each level, the number of
//elements is one less than the previous level and elements at the level is the sum of
//consecutive two elements in the previous level.

    public static void trianglePrintArr(int arr[]) {
        if (arr.length == 1) {
            System.out.println(arr[0]);
            return;
        }
        int ans[] = new int[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            ans[i - 1] = arr[i - 1] + arr[i];
        }
        trianglePrintArr(ans);
        printArrRec(arr, 0);
        System.out.println();

    }

    //Given an array of size n, generate and print all possible combinations of r elements in array. (Hard)
//Input1:
//n = 4
//{1, 2, 3, 4}
//r = 2
//Output1:
    public static void possible_Combination(int arr[], int r, int idx) {
        if (idx == arr.length) {
            return;
        }
        for (int i = idx + 1; i < arr.length - 1; i++) {
            System.out.print("[" + arr[idx]);
            int k = i;
            for (int j = 1; j < r; j++) {

                System.out.print("," + arr[k]);
                k++;
            }
            System.out.print("]");
            System.out.println();

        }
        possible_Combination(arr, r, idx + 1);
    }
    // by itaration approach 
//    public static void possible_com_It(int arr[],int pair){
//        for(int i=0;i<arr.length;i++){
//            for(int j=i+1;i<arr.length;j++){
//                for(int k=j+1;k<arr.length;k++){
//                    System.out.println("["+arr[i]+","+arr[j]+","+arr[k]+"]");
//                }
//            }
//        }
//        
//    }
//    
}
