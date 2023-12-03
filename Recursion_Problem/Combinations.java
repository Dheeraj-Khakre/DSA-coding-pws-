package Recursion_Problem;

import java.util.Arrays;

public class Combinations {

    public static void generateCombinations(int[] arr, int r) {
        int[] data = new int[r];
        generateCombinationsUtil(arr, data, 0, arr.length - 1, 0, r);
    }

    private static void generateCombinationsUtil(int[] arr, int[] data, int start, int end, int index, int r) {
        if (index == r) {
            for (int i = 0; i < r; i++) {
                System.out.print(data[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = start; i <= end && end - i + 1 >= r - index; i++) {
            data[index] = arr[i];
            generateCombinationsUtil(arr, data, i + 1, end, index + 1, r);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4,5};
        int r = 3;
        generateCombinations(arr, r);
    }
}
