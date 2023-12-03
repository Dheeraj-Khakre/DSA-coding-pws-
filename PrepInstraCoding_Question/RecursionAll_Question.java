/*
Power of a Number – C | C++ | Java | Python
Prime Number – C | C++ | Java | Python
Largest element in an array – C | C++ | Java | Python
Smallest element in an array – C | C++ | Java | Python
Reversing a Number – C | C++ | Java | Python
HCF of two numbers – C | C++ | Java | Python
LCM of two numbers – C | C++ | Java | Python
Program to calculate length of the string using recursion
Print All Permutations of a String- C | C++ | Java | Python
Given an integer N the task is to print the F(N)th term.- C | C++ | Java | Python
Given a list arr of N integers, print sums of all subsets in it- C | C++ | Java | Python
Last non-zero digit in factorial- C | C++ | Java | Python
Given a positive integer N, return the Nth row of pascal’s triangle – C | C++ | Java | Python
Given an integer N representing the number of pairs of parentheses, the task is to generate all combinations of well-formed(balanced) parentheses – C | C++ | Java | Python
Find the Factorial of a number using recursion – C | C++ | Java | Python
Find all possible Palindromic partitions of the given String – C | C++ | Java | Python
Find all the N bit binary numbers having more than or equal 1’s than 0’s – C | C++ | Java | Python
Given a set of positive integers, find all its subsets – C | C++ | Java | Python
Given a string s, remove all its adjacent duplicate characters recursively –
 */
package PrepInstraCoding_Question;

public class RecursionAll_Question {

    public static int power(int n, int pow) {
        if (pow == 0) {
            return 1;
        }
        return n * power(n, pow - 1);
    }

    public static boolean isPrime(int n, int i) {
        if (n <= 2) {
            return (n == 2) ? true : false;
        }
        if (i == n) {
            return true;
        }
        if (n % i == 0) {
            return false;
        }
        return isPrime(n, i + 1);

    }

    public static int maxArray(int arr[], int i) {
        if (i == arr.length - 1) {
            return arr[i];
        }
        return Math.max(arr[i], maxArray(arr, i + 1));
    }

    public static int minArray(int arr[], int i) {
        if (i == arr.length - 1) {
            return arr[i];
        }
        return Math.min(arr[i], minArray(arr, i + 1));
    }

    public static int hcf(int x, int y) {

        if (y == 0) {
            return x;

        }
        return hcf(y, x % y);
    }

    public static int lcm(int x, int y) {
        return (x / hcf(x, y)) * y;
    }

    public static int lengthStr(String str) {
       // System.out.println(str);
        if (str.equals("")) {
            return 0;

        }
        return lengthStr(str.substring(1)) + 1;
    }
    public static void permutationStr(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String newstr=str.substring(0,i)+str.substring(i+1);
            permutationStr(newstr, ans+ch);
        }
        
        
    }
public static void revrsingArray(int arr[],int i){
    if(i>=arr.length/2){
        return;
    }
    int temp=arr[i];
    arr[i]=arr[ arr.length-1-i];
    arr[arr.length-1-i]=temp;
    revrsingArray(arr, i+1);
}
    public static void main(String args[]) {
        // TODO code application logic here
//        System.out.println("power " + power(2, 3));
//        System.out.println("is prime " + isPrime(7, 2));
        int arr[] = {-2, 1, 4, 2, 5, 7, 9, 10, 5};
//        System.out.println("max elelment in the array " + maxArray(arr, 0));
//        System.out.println("min elelment in the array " + minArray(arr, 0));
//        System.out.println("hcf of two no. is " + hcf(96, 56));
//        ///System.out.println("hcf of two no. is "+hcf(96, 56));
//        System.out.println(" " + lcm(12, 9));
       String str = "123456789";
//        System.out.println(str.length() + "length of the str " + lengthStr(str));
//        revrsingArray(arr, 0);
//        for(int a:arr){
//            System.out.print(" "+a);
//        }
permutationStr(str, "");

    }
}
