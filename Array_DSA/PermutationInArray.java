package Array_DSA;

public class PermutationInArray {

    public static void permutation(int arr[]) {
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                for (int aa : arr) {
                    System.out.print("  " + aa);
                }
                count++;
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                System.out.println();  
            }
        }
        System.out.println("total permutation "+count);

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        permutation(arr);
    }
}
