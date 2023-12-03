/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package PrepInstraCoding_Question;

public class Working_with_Numbers_Practice_Q {

//   Highest Common Factor(HCF): C | C++ |  Java | Python
    public static void hcf1(int a, int b) {
        int hcf = 0;
        for (int i = 1; i <= a || i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }

        }
        System.out.println("HCF = " + hcf);
    }

    public static void hcf2(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }

        }
        System.out.println(" hcf = " + a);
    }

    public static int getHCF(int a, int b) {
        return b == 0 ? a : getHCF(b, a % b);
    }

//Lowest Common Multiple (LCM) : C | C++ | Java | Python
    public static int lcm(int a, int b) {
        int i = (a > b) ? a : b;
        int lcm = 0;
        for (; i <= a * b; i++) {
            if (i % a == 0 && i % b == 0) {
                lcm = i;
                break;
            }
        }
        return lcm;
        // System.out.println("lcm = " + lcm);
    }

    //  lcm by formula lcm = (A*B)/hcf;
    public static void lcm2(int a, int b) {
        int lcm = (a * b) / getHCF(a, b);
        System.out.println("lcm is = " + lcm);
    }
//Greatest Common Divisor : C | C++ | Java | Python
//Binary to Decimal to conversion : C | C++ | Java | Python

    public static int binaryTo_Decimal(int n) {
        int dec = 0;
        int pow = 0;
        while (n > 0) {
            dec += n % 10 * Math.pow(2, pow++);
            n /= 10;
        }
        return dec;
    }
//Octal to Decimal conversion : C | C++ | Java | Python

    public static void octalTo_Decimal(int n) {
        int dec = 0;
        int pow = 0;
        while (n > 0) {
            dec += n % 10 * Math.pow(8, pow++);
            n /= 10;
        }
        System.out.println("Octal to decimal " + dec);
    }
//Hexadecimal to Decimal conversion: C | C++ | Java | Python

    public static void hexadecimalTo_Decimal(int n) {
        int dec = 0;
        int pow = 0;
        while (n > 0) {
            dec += n % 10 * Math.pow(16, pow++);
            n /= 10;
        }
        System.out.println("hexadecimal to  decimal " + dec);
    }
//Decimal to Binary conversion: C | C++ | Java | Python

    public static void decimalTo_Binary(int n) {
        int bin = 0;
        int pow = 0;
        while (n > 0) {
            bin += n % 2 * Math.pow(10, pow++);
            n /= 2;
        }
        System.out.println(" binary " + bin);
    }
//Decimal to Octal Conversion: C | C++ | Java | Python

    public static int decimalTo_octal(int n) {
        int octal = 0;
        int pow = 0;
        while (n > 0) {
            octal += n % 8 * Math.pow(10, pow++);
            n /= 8;
        }
        return octal;
    }
//Decimal to Hexadecimal Conversion: C | C++ | Java | Python

    public static void decimal_hexadecimal(int n) {
        int hex = 0;
        int pow = 0;
        while (n > 0) {
            hex += n % 16 * Math.pow(10, pow++);
            n /= 16;
        }
        System.out.println(" decimal  to hexadecimal " + hex);
    }
//Binary to Octal conversion : C | C++ | Java  | Python

    public static void binaryTo_octal(int n) {
        int dec = binaryTo_Decimal(n);
        int oct = decimalTo_octal(dec);

        System.out.println(" binary to ctal " + oct);
    }
//Octal to Binary conversion : C | C++ | Java | Python

    public static void octal_biary(int n) {
        int dec = 0;
        int pow = 0;
        while (n > 0) {
            dec += n % 10 * Math.pow(8, pow++);
            n /= 10;
        }
        int bin = 0;
        n = dec;
        pow = 0;
        while (n > 0) {
            bin += n % 2 * Math.pow(10, pow++);
            n /= 2;
        }
        System.out.println("octal to binary " + bin);
    }
//Quadrants in which a given coordinate lies : C | C++ | Java | Python

    public static void quadrants(int x, int y) {
        if (x == 0 && y == 0) {
            System.out.println("point (" + x + "," + y + " ) central point");
            return;
        }
        if (x > 0 && y > 0) {
            System.out.println("point (" + x + "," + y + " ) first Quadrants");
        } else if (x < 0 && y > 0) {
            System.out.println("point (" + x + "," + y + " ) second Quadrants");
        } else if (x < 0 && y < 0) {
            System.out.println("point (" + x + "," + y + " ) third Quadrants");
        } else {
            System.out.println("point (" + x + "," + y + " ) fourth Quadrants");
        }
    }
//Permutations in which n people can occupy r seats in a classroom : 

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;

        }
        return fact;
    }

    public static int parmutation(int n, int r) {

        return factorial(n) / factorial(n - r);
    }

//Maximum number of handshakes: C | C++ | Java | Python
    public static void handshakes(int n) {
        System.out.println("Maximum number of handshakes: " + ((n - 1) * n) / 2);
    }
//Addition of two fractions: C | C++ | Java | Python
    // example= 1/3 + 3/9 = 6/9 =2/3;

    public static void fractions_Addition(int x1, int y1, int x2, int y2) {

        int Y = y1 * y2;
        int X = (x1 * y2) + (x2 * y1);
        int hcf = getHCF(X, Y);

        System.out.println(" ( " + X / hcf + "," + Y / hcf + " )");

    }
//Replace all 0’s with 1 in a given integer : C | C++ | Java | Python

    public static void replace0_1(int n) {
        int no = 0;
        while (n > 0) {
            if (n % 10 == 0) {
                no = no * 10 + 1;
            } else {
                no = no * 10 + n % 10;
            }
            n /= 10;
        }
        while (n > 0) {
            if (n % 10 == 0) {
                no = no * 10 + 1;
            } else {
                no = no * 10 + n % 10;
            }
            n /= 10;
        }
        while (no > 0) {

            n = n * 10 + no % 10;

            no /= 10;
        }
        System.out.println("no is " + n);
    }

    // second approach
    public static void replay0_1(int n) {
        String str = Integer.toString(n);
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                sb.append(1);
            } else {
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);
    }

//Can a number be expressed as a sum of two prime numbers : C | C++ | Java | Python
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

    public static void sumPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (isPrime(i)) {
                if (isPrime(n - i)) {
                    System.out.println(n + " = " + i + " + " + (n - i));
                }
            }
        }
    }
//Count possible decoding of a given digit sequence : C | C++ | Java | Python

//Calculate the area of a circle : C | C++ | Java | Python
//Find the prime numbers between 1 to 100 : C | C++ | Java | Python
//Calculate the number of digits in an integer : C | C++ | Java | Python
    public static void digitNo(int n) {
        System.out.println("the number of digits in an integer :" + (int) (Math.log10(n) + 1));
    }
//Convert digit/number to words : C | C++ | Java | Python
//Counting number of days in a given month of a year: C | C++ | Java | Python
//Finding Number of times x digit occurs in a given input : C | C++ | Java | Python
//Finding Roots of a quadratic equation : C | C++ | Java | Python

    public static void main(String args[]) {
        // TODO code application logic here
//        hcf1(36, 60);
//        hcf2(36, 60);
//        System.out.println(" hcf " + getHCF(36, 60));
//        lcm(12, 14);
//        lcm2(12, 14);
//        System.out.println("binary to decimal"+  binaryTo_Decimal(101));
//       System.out.println(" decimal to octal "+ decimalTo_octal(108));
//        hexadecimalTo_Decimal(145);
//        octalTo_Decimal(154);
//        decimalTo_Binary(5);
//        decimalTo_octal(108);
//        decimal_hexadecimal(325);
//        binaryTo_octal(1011);
//        octal_biary(13);
        // quadrants(-3, -33);
        // System.out.println(parmutation(9, 5));
        //  fractions_Addition(1, 3, 3, 9);//Finding number of integers which has exactly x divisors: C | C++ | Java | Python

//        replace0_1(101401);
//        replay0_1(101401);
       // sumPrime(14);
        digitNo(1014);
    }
}
