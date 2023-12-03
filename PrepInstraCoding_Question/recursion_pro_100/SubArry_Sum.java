//Given a list arr of N integers, print sums of all subsets in it- C | C++ | Java | Python
package PrepInstraCoding_Question.recursion_pro_100;

public class SubArry_Sum {

    public static void subArray_sum(int arr[], int i, int sum) {
        if (i == arr.length ) {
            System.out.print(sum + " ");
            return;
        }
        subArray_sum(arr, i + 1, sum + arr[i]);
        subArray_sum(arr, i + 1, sum);
    }

    public static void main(String args[]) {
        // TODO code application logic here
        int arr[] = {5, 4, 3};
        subArray_sum(arr, 0, 0);
    }
}
