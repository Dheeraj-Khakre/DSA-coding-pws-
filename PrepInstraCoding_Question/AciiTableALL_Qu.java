
/*Positive or Negative number: C | C++ |  Java | Python
Even or Odd number: C | C++ | Java | Python
Sum of First N Natural numbers:  C | C++ | Java | Python
Sum of N natural numbers:  C | C++ | Java | Python
Sum of numbers in a given range: C | C++ | Java  | Python
Greatest of two numbers: C | C++ | Java | Python
Greatest of the Three numbers: C | C++ | Java | Python
Leap year or not: C | C++ | Java | Python
Prime number: C | C++ | Java | Python
Prime number within a given range: C | C++ | Java | Python
Sum of digits of a number: C | C++ | Java | Python
Reverse of a number : C | C++ | Java | Python
Palindrome number*/
package PrepInstraCoding_Question;

import java.util.Scanner;

public class AciiTableALL_Qu {

    public static void febonacci(int n) {
        int x = 0;
        int y = 1;
        int fn = 0;
        for (int i = 1; i <= n; i++) {
            fn += x;
            x = y;
            y = fn;
            System.out.print(" " + fn);
        }

    }

    public static void nthFebonacci(int n) {
        int x = 0, y = 1, fn = 0;
        for (int i = 1; i <= n; i++) {
            fn += x;
            x = y;
            y = fn;
        }
        System.out.println("nth turms is " + fn);
    }

    public static void fact(int n) {
        int fact = 1;
        while (n > 0) {
            fact *= n;
            n--;
        }
        System.out.println(fact);
    }

    public static void sum_rev_isPelom(int n) {
        int sum = 0;
        int no = 0;
        int No = n;
        while (n > 0) {
            sum += n % 10;
            no = no * 10 + n % 10;
            n /= 10;
        }
        System.out.println("sum of digit is " + sum);
        System.out.println("revers no = " + no);
        System.out.println("chackig no. are prelondrom");

        if (no == No) {
            System.out.println("pelemdrome");
        } else {
            System.out.println("not a pelemdrome");
        }

    }

    public static boolean isArmstrong_Number(int n) {
        int no = n;
        int arm = 0;
        int len = 0;
        while (n > 0) {
            len++;
            n /= 10;
        }
        n = no;
        while (no > 0) {
            arm = arm + (int) Math.pow(no % 10, len);
            no /= 10;
        }

        return arm == n;

    }

    public static void armstronInRange(int lb, int ub) {
        for (int i = lb; i <= ub; i++) {
            if (isArmstrong_Number(i)) {
                System.out.print(" " + i);
            }
        }
    }

    public static void primeInRange(int x, int y) {

        for (int i = x; i <= y; i++) {
            if (isPrime(i)) {
                System.out.print(" " + i);
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n < 1) {
            System.out.println("negetiv no. is not prime");
            return false;
        }
        if (n == 2 || n == 1) {
            // System.out.print(" is prime");
            return true;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                //   System.out.print("not prime");
                return false;
            }
        }
        // System.out.print("prime");
        return true;

    }

    // 1.
    public static void chackNo(int n) {
        if (n > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("negitive");
        }

    }

    public static void evenOdd(int n) {
        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("odd");
        }

    }

    public static void sumNNatural(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println("sum n natural number " + sum);
    }

    public static void threeBig(int x, int y, int z) {
        if (x >= y && x >= z) {
            System.out.println("big " + x);
        } else if (y >= x && y >= z) {
            System.out.println("big " + y);
        } else {
            System.out.println("big " + z);
        }
    }

    // leap year 
    public static void isLeapYear(int n) {
        if (n % 4 == 0) {
            System.out.println("leap year");
        } else {
            System.out.println("not leap year ");

        }
    }

    public static void pow(int x, int n) {
        int pow = 1;
        while (n > 0) {
            pow *= x;
            n--;
        }
        System.out.println(pow);
    }

    public static void factor(int n) {
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {

                System.out.println(" " + i);
            }

        }
        factorPrime(n);
    }

    public static void factorPrime(int n) {
        System.out.println("prime factor");

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                int x = n;
                while (x % i == 0) {
                    System.out.print(i + " ");
                    x /= i;
                }
            }
        }

    }

    public static boolean strongNumber(int n) {

        int strong = 0;
        int no = n;
        while (n > 0) {
            int ld = n % 10;
            int fact = 1;
            for (int i = ld; i > 0; i--) {
                fact *= i;
            }
            strong += fact;
            n /= 10;

        }
        return no == strong;
    }

    public static void strongNoRange(int lb, int ub) {
        for (int i = lb; i <= ub; i++) {
            if (strongNumber(i)) {
                System.out.println(" " + i);
            }
        }
    }

    public static boolean prefectNo(int n) {

        int pre = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                pre += i;
            }
        }

        return n == pre;
    }

    public static void prefactNoRange(int lb, int ub) {
        for (int i = lb; i <= ub; i++) {
            if (prefectNo(i)) {
                System.out.println(" " + i);
            }
        }
    }
//Check Whether or Not the Number is an Automorphic Number in Java

    public static boolean automorphic_Number(int n) {
        int pow = n * n;
        while (n > 0) {
            if (n % 10 != pow % 10) {
                //System.out.println("no is not automorphic_Number");
                return false;
            }
            n /= 10;
            pow /= 10;
        }
        //System.out.println("no. is automorphic_Number");
        return true;
    }
//Harshad number 

    public static boolean Harshad_number(int n) {
        int no = n;
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return no % sum == 0;
    }

    public static void automorphic_NumberRange(int lb, int ub) {
        for (int i = lb; i <= ub; i++) {
            if (automorphic_Number(i)) {
                System.out.println(" " + i);
            }

        }
    }

    public static void Harshad_numberRange(int lb, int ub) {
        for (int i = lb; i <= ub; i++) {
            if (Harshad_number(i)) {
                System.out.print(" " + i);
            }
        }
    }
    public static void abundant_numbe(int n){
        int sum=0;
      
        
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum>n){
            System.out.println("Abundant numbe");
        }else{
            System.out.println(" not Abundant numbe");
        }
    }

//    public static void abundan_numbeRange(int lb, int ub) {
//        for (int i = lb; i <= ub; i++) {
//            if (automorphic_Number(i)) {
//                System.out.print(" " + i);
//            }
//        }
//    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //1.
//        System.out.println("enter no.");
//      int n=sc.nextInt();
//      System.out.println("no. is positiv or negetive chacking");
//      chackNo(n);
//       System.out.println("no. is even or odd chacking");
//      evenOdd(n);
//      System.out.println("sum of n natural no.");
//      sumNNatural(n);
//      System.out.println("tree biggest no.");
//      threeBig(sc.nextInt(),sc.nextInt(),sc.nextInt());
//      System.out.println("enter year for chacking leap year ");
//      isLeapYear(sc.nextInt());
//        System.out.println("enter is prime");
//        System.out.println(" prime = " + isPrime(sc.nextInt()));
//        System.out.println("enter range to prime lower and upper");
//        primeInRange(sc.nextInt(), sc.nextInt());
//        System.out.println("sum of digit for the no. enter");
//        sum_rev_isPelom(sc.nextInt());
//        System.out.println("enter the number to chacking the no. is Armstrong Number");
//       
//        armstronInRange(sc.nextInt(), sc.nextInt());
//febonacci(sc.nextInt());
//nthFebonacci(sc.nextInt());
//System.out.println("enter n for the factorial");
//fact(sc.nextInt());
//System.out.println("enter no.");
//strongNoRange(sc.nextInt(), sc.nextInt());
        System.out.println("enter no ");
        //prefactNoRange(0, sc.nextInt());
        automorphic_NumberRange(sc.nextInt(),sc.nextInt());
//        Harshad_number(sc.nextInt());
      //  Harshad_numberRange(sc.nextInt(), sc.nextInt());
     // abundant_numbe(sc.nextInt());
    }
}
