/*
 * A chocolate factory is packing chocolates into the packets.
The chocolate packets here represent an array  of N number of integer values.
The task is to find the empty packets(0) of chocolate and push it to the end of the conveyor belt(array).
 */
package TCS_NQT_Question;

public class ChocolatProblem {

    public static void chocolateEmpty(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int x = 0;
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[j] == 0) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    x++;
                }
            }
            if(x==0){
                break;
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = {0, 4, 6, 0, 3, 0, 5, 0};
        chocolateEmpty(arr);
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
