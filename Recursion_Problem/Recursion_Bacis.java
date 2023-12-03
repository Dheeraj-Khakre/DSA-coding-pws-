

package Recursion_Problem;

import java.util.Scanner;


public class Recursion_Bacis {

    // n natural  to 1 to n in asending order
    static void nAscendning(int n){
        // bas case
        if(n==1){
            System.out.println(n);
            return;
        }
        nAscendning(n-1);
        System.out.println(n);
    }
    static void ndescendning(int n){
         System.out.println(n);
        // bas case
        if(n==1){
            System.out.println(n);
            return;
        }
       
        ndescendning(n-1);
      //  System.out.println(n);
    }
    static int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }
    static int fibo(int n){
        if(n==0|| n==1){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
    static int sumDigit(int n){
        if(n>=0 && n<=9){
            return n;
        }
        return sumDigit(n/10)+n%10;
    }
    static int pow(int x, int n){
        if(n==0){
            return 1;
        }
        return x*pow(x,n-1);
    }
    static int optimizPow(int x, int n){
        if(n==0)return 1;
        int smallPow = optimizPow(x, n/2);
        if(n%2==0){
            return smallPow*smallPow;
        }else{
            return smallPow*smallPow*x;
        }
    }
    public static void main(String args[]) {
       Scanner sc= new Scanner(System.in);
//        System.out.println("enter n ");
//        nAscendning(sc.nextInt());
//         System.out.println("enter n ");
//        ndescendning(sc.nextInt());
//        System.out.println("enter factorial number ");
//        System.out.println( fact(sc.nextInt()));
//        System.out.println("enter nth tems for fibonacci series");
//        int n= sc.nextInt();
//        for(int i=0;i<n;i++){
//            System.out.print(fibo(i));
//        }
//        System.out.println();
        
        System.out.println("enter x and n for power");   
        System.out.println(optimizPow(sc.nextInt(), sc.nextInt()));
        
    }
}
