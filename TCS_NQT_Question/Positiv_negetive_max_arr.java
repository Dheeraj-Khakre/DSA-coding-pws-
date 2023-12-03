package TCS_NQT_Question;

import java.util.Arrays;
import java.util.Scanner;

public class Positiv_negetive_max_arr {

    public static void maxSum(int[] arr) {
        Arrays.sort(arr);
        //worst case 
        if(arr.length<=2){
            System.out.println("max = "+arr[arr.length-1]);
            return;
        }
        int maxSum = Integer.MIN_VALUE;
        // minLength = 0;
        int sumel = 0;
        int length = 0;
        int idx = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] < 0 && arr[i + 1] > 0) {
                idx = i;
                break;
            }
        }
       
       
        
        for (int i =idx,j=arr.length-1; i>=0;i--,j-- ) {
              
           
            sumel+=arr[j]+arr[i];
              
            
            if (maxSum < sumel) {
                length += 2;
                maxSum = sumel;
            }

        }
        System.out.println("max sum = "+maxSum);
        System.out.println("length "+length);

    }

    public static void main(String args[]) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        maxSum(arr);
    }
}
/*You are given an array A of size N. Your friend gave me an amazıng task for you. Your friend likes one type of Sequence. So, he called that type of sequence a fair sequence. You should select a fair sequence of maximum length from an array. Here a fair sequence is nothing but you have to select elements in a pattern like positive element, negative element, positive element… (negative element, positive element, negative element, to form a sequence.
Your task is to print the maximum sum of elements possible by selecting a fair subsequence with maximum length.
Ex: If art A = [-1, 18, 13, 18, 2, 16,7,-1, -213, 11]. Here your minimum length can be which subsequences -7 -2, 7,-1, 11. The sum is 27,-1, which is the maximum Your friend also kept a timer of 15 min. If you can solve. Your task is to print the maximum sum of elements possible by selecting a fair subsequence with maximum length.
Ex: If array A = [-1, 18, 13, 18, 2, 16,7,-1, -213, 11]. Here your minimum length can be 6. The fair subsequence is -1, -18,-7, -2, 7,-1, 11. The Sum is 32 which is the maximum possible. Your friend also kept a timer of 15 min. You will win, will you be able to do it?

NOTE: You should select the elements in a fair sequence only.

Example – 1:

Input:
5 – N ( Number of elements in an array )
21 12 13 -21 -2 – Array A consists of N elements
Output:
19
*/
