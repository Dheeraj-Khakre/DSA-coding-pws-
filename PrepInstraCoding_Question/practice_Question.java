package PrepInstraCoding_Question;

public class practice_Question {

    //Prime number within a given range: C | C++ | Java | Python
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeIn_Range(int lb, int ub) {
        for (int i = lb; i <= ub; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    //Sum of digits of a number: C | C++ | Java | Python
    public static void sumOFDigit(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println("sum of digit " + n + " is = " + sum);

    }

    //Reverse of a number : C | C++ | Java | Python
    public static void reverseNo(int n) {
        int No = 0;
        while (n > 0) {
            No = No * 10 + n % 10;
            n /= 10;
        }
        System.out.println("reverse no is " + No);
    }
    //Palindrome number: C | C++ | Java | Python

    public static void isPalindrome(int n) {
        int No = 0;
        int N = n;
        while (n > 0) {
            No = No * 10 + n % 10;
            n /= 10;
        }
        if (N == No) {
            System.out.println("no is palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
//Armstrong number : C | C++ | Java | Python

    public static boolean isArmstrong(int n) {
        int pow = 0;
        int no = n;
        int N = n;
        while (n > 0) {
            pow++;
            n /= 10;
        }
        while (no > 0) {
            n = (int) (n + Math.pow(no % 10, pow));
            no /= 10;
        }

        return N == n;
    }

//Armstrong number in a given range : C | C++ | Java | Python
    public static void armstrongIn_Range(int lb, int ub) {
        for (int i = lb; i <= ub; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }
//Fibonacci Series upto nth term : C | C++ | Java | Python

    public static void fibonacci(int n) {
        int x = 0;
        int y = 1;
        int z = 0;
        for (int i = 1; i <= n; i++) {
            z += x;
            x = y;
            y = z;
            System.out.print(z + " ");
        }

    }
//Find the Nth Term of the Fibonacci Series

    public static void fibonacci_Nth(int n) {
        int x = 0;
        int y = 1;
        int z = 0;
        for (int i = 1; i <= n; i++) {
            z += x;
            x = y;
            y = z;
            if (i == n) {
                System.out.println(z + " ");
            }

        }

    }

//    Factor of a number : C | C++ | Java | Python
    public static void factor(int n) {
        for (int i = 1; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                if (i != n / i) {
                    System.out.print(n / i + " ");
                }
            }
        }
    }
//Strong number : C | C++ | Java | Python

    public static boolean isStrongNo(int n) {
        int stg = 0;
        int no = n;
        int fact = 1;
        while (n > 0) {
            for (int i = 1; i <= n % 10; i++) {
                fact *= i;
            }
            stg += fact;
            fact = 1;
            n /= 10;
        }
//        if (no == stg) {
//            System.out.println("is Strong number");
//        } else {
//            System.out.println("not strong number");
//        }
return no==stg;
    }
    // strong no. in range ..
    public static  void strongNo_Range(int ib, int ub){
        for(int i=ib;i<=ub;i++){
            if(isStrongNo(i)){
                System.out.print(i+" ");
            }
        }
    }
    // dynamic programming in strong number 
    public static boolean strongNo_DP(int n){
        int fact[]= new int[10];
          fact[0]=fact[1]=1;
                
        for(int i=2;i<10;i++){
            fact[i]=fact[i-1]*i;
        }
        int sum=0;
        int temp=n;
        while(n>0){
            sum+=fact[n%10];
            n/=10;
        }
        return sum==temp;
    }
           
//Perfect number : C | C++ | Java | Python
//Automorphic number : C | C++ | Java | Python
//Harshad number : C | C++ | Java | Python
//Abundant number : C| C++ | Java | Python
//Friendly pair : C | C++ |   Java | Python

    public static void main(String args[]) {
        System.out.println("prime no. in range ");
        primeIn_Range(0, 100);
        System.out.println("sum of digit");
        sumOFDigit(1474);
        System.out.println("reverse no ");
        reverseNo(123456);
        System.out.println("palindrome no ");
        isPalindrome(12121);
        System.out.println("Armstrong no " + isArmstrong(370));
        armstrongIn_Range(10, 10000);
        System.out.println("fibonacchi serise");
        fibonacci(15);
        fibonacci_Nth(15);
        System.out.println("factor of no.");
        factor(10);
        System.out.println("stong no. 147 "+isStrongNo(147));
        System.out.println("stong no. 145 "+strongNo_DP(145));
        strongNo_Range(1,100000000);
                
        
        

    }
}
