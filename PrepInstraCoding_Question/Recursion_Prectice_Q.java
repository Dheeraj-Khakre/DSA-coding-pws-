package PrepInstraCoding_Question;

import com.sun.source.doctree.ReturnTree;

public class Recursion_Prectice_Q {

//    Power of a Number – C | C++ | Java | Python
    public static int pow(int x, int n) {
//        if(n==0){
//            return 1;
//            
//        }
//      
        return n == 0 ? 1 : x * pow(x, n - 1);

    }
//Prime Number – C | C++ | Java | Python

    public static boolean isPrime(int n, int i) {
        if (n <= 1) {
            return false;
        }
        if (n % i == 0) {
            return false;
        }
        if (i + 1 == n) {
            return true;
        }
        return isPrime(n, i + 1);
    }
//Largest element in an array – C | C++ | Java | Python

    public static int largestElement_Arr(int arr[], int i) {
        return i == arr.length - 1 ? arr[i] : Math.max(arr[i], largestElement_Arr(arr, i + 1));
    }

    //Smallest element in an array – C | C++ | Java | Python
    public static int smallestElement_Arr(int arr[], int i) {
        return i == arr.length - 1 ? arr[i] : Math.min(arr[i], largestElement_Arr(arr, i + 1));
    }

//Reversing a Number – C | C++ | Java | Python
    static int a = 0;

    public static int revereNo(int n) {

        if (n != 0) {
            a = a * 10 + n % 10;
            revereNo(n / 10);
        }

        return a;
    }
//HCF of two numbers – C | C++ | Java | Python

    public static int hcf(int a, int b) {
        return b == 0 ? a : hcf(b, a % b);
    }
//LCM of two numbers – C | C++ | Java | Python

    public static int lcm(int a, int b) {
        return (a * b) / hcf(a, b);
    }

//Program to calculate length of the string using recursion- C | C++ | Java | Python
    public static int length_str(String str) {
        // String newstr = str.substring(i);
        if (str.equals("")) {
            return 0;
        }

        return length_str(str.substring(1)) + 1;

    }
//Print All Permutations of a String- C | C++ | Java | Python

    public static void permutation(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i + 1);
            permutation(newstr, ans + ch);

        }
    }

    // reversing arrray
    public static void reversingArr(int arr[], int i) {
        if (i == arr.length / 2) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[arr.length - 1 - i];
        arr[arr.length - 1 - i] = temp;
        reversingArr(arr, i + 1);
    }
//Given an integer N the task is to print the F(N)th term.- C | C++ | Java | Python

    public static int fn_term(int n, int i, int cur) {
        if (cur  == n+1) {
            return 0;
        }
        int trm = 1;
        for (int k = 1; k <= cur; k++,i++) {
               trm*=i;
               
              
        }
        return trm + fn_term(n, i, cur+1);
    }


//Find all the N bit binary numbers having more than or equal 1’s than 0’s – C | C++ | Java | Python
//Given a set of positive integers, find all its subsets – C | C++ | Java | Python
//Given a string s, remove all its adjacent duplicate characters recursively – C | C++ | Java | Python

    public static void main(String args[]) {
        // TODO code application logic here
        System.out.println(" power " + pow(2, 3));
        System.out.println("is prime " + isPrime(19, 2));
        int arr[] = {1, 4, 2, 5, 7, 9, 3, 6, 8};
        System.out.println("largest element is arr " + largestElement_Arr(arr, 0));
        System.out.println("smallest element is arr " + smallestElement_Arr(arr, 0));
        System.out.println("revers no is = " + revereNo(12345));
        System.out.println("hcf " + hcf(12, 14));
        System.out.println("lcm " + lcm(12, 14));
        System.out.println("String length is " + length_str("dheeraj"));
        permutation("123", "");
        reversingArr(arr, 0);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(" fn term "+fn_term(4, 1, 1));
    }
}
