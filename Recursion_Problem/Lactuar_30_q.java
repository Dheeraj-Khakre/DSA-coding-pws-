package Recursion_Problem;

import java.util.Scanner;

public class Lactuar_30_q {
// given number n and  value of k find kth multiflication 

    static void printMult(int n, int k) {
        if (k == 0) {
            return;
        }
        printMult(n, k - 1);
        System.out.println(n * k);
    }

    // sum of first n natural number 
    static int sumNatural(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumNatural(n - 1);
    }
//sum of n natural number in alternativ fashion
    
    static int sumAlternativ(int n) {
        if (n == 1) {
            return n;
        }
        if (n % 2 == 0) {
            return sumAlternativ(n - 1) - n;
        } else {
            return sumAlternativ(n - 1) + n;
        }
    }

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
//        System.out.println("enter value of n and k multiple");
//        printMult(sc.nextInt(), sc.nextInt());
//        System.out.println("enter n  of natural sum ");
//        System.out.println(sumNatural(sc.nextInt()));
//        System.out.println("enter n of n natural altarnativ sum");
//        System.out.println(sumAlternativ(sc.nextInt()));
//        System.out.println("enter n ");
//        patternPrint(sc.nextInt());
        System.out.println("enter n and m terms");
        System.out.println(sum(sc.nextInt(), sc.nextInt()));
        
    }

    // assigment 
    // q1 - Given a number n, print the following pattern without using any loop.
//n, n-5, n-10, ..., 0, 5, 10, ..., n-5, n
    static void patternPrint(int n) {
        if (n <= 0) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        patternPrint(n - 5);
        System.out.println(n);
        
    }
//    Q2 - Find m-th summation of first n natural numbers where m-th summation of first n natural
//numbers is defined as following:
//If m > 1: SUM(n, m) = SUM(SUM(n, m - 1), 1)
//Else :SUM(n, 1) = Sum of first n natural numbers.
    
    static int sum(int n, int m) {
        
        if (m == 1) {
            return sumNatural(n);
        }
        return sum(sumNatural(n), m - 1);
        
    }
}
