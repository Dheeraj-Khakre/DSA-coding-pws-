package loops;

import java.util.Scanner;

public class LoopsQue {

    /*2 - Write a program to enter the numbers till the user wants, the number can be positive, 



negative or zero. Calculate the sum of numbers until a negative number is encountered.
If the input is a negative number, current sum is discarded and print -1.*/
    public static void sumofEnterNo() {
        int sum = 0;
        boolean flag = false;
        System.out.println("entr n  how mani number  are u entering ");
        int n = new Scanner(System.in).nextInt();
        for (int i = 1; i <= n; i++) {
            int x = new Scanner(System.in).nextInt();

            sum += x;
            if (x < 0) {
                flag = true;
            }
        }
        if (flag) {
            System.out.println("sum is =  -1");
            return;
        }
        System.out.println("sum = " + sum);
    }
    /// fabonacci series

    public static void feboncci(int n) {
        int a = 1, b = 0, z = 0;
        for (int i = 1; i <= n; i++) {
            z = a + b;
            a = b;
            b = z;
            System.out.print(" " + z);
        }

    }

    // count no. of digit
    public static void allDigitOpration(int n) {
        int N = n;
        int digit = 0;
        int sum = 0;
        int rev = 0;
        while (n > 0) {
            int ld = n % 10;
            rev = rev * 10 + ld;
            sum += ld;
            digit++;
            n /= 10;

        }
        System.out.println("no of digit in  number   " + N + " = " + digit);
        System.out.println("sum  of digit in  number   " + N + " = " + sum);
        System.out.println("revres  of   number   " + N + " = " + rev);

    }

    public static void fact_power(int a, int b, int n) {
        int pow = 1;
        int fact = 1;
        for (int i = 1; i <= b; i++) {
            pow *= a;
        }
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        System.out.println(" power of " + a + " raise to " + b + "  = " + pow);
        System.out.println(" fact of " + n + " = " + fact);

    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        //  allDigitOpration( sc.nextInt());
        //  fact_power(sc.nextInt(), sc.nextInt(), sc.nextInt());
        //feboncci(sc.nextInt());
        sumofEnterNo();
    }
}
