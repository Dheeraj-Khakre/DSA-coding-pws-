package PrepInstraCoding_Question;

import java.awt.Color;
import java.util.Scanner;

public class Working_with_Numbers {
    
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
//        System.out.println("enter two no. x  ,y ");
//        System.out.println(" hcf = "+hcf(sc.nextInt(),sc.nextInt()));
//        System.out.println("lcm  = "+lcm(sc.nextInt(),sc.nextInt()));
//        System.out.println("enter binary no.");

//
//        System.out.println("decimal to Hexadecimal " + decimalToHexadecimal(sc.nextInt()));
//       String hex=decimalToHexadecimal(sc.nextInt());
//       for(int i=hex.length()-1;i>=0;i--){
//           System.out.print(hex.charAt(i));
//       }
//         binaryToOctal(sc.nextInt());
        //  quadrantLie(sc.nextInt(), sc.nextInt());
        //  handShake(sc.nextInt());
        // addTwoFactor(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
//        replays0s_by1(sc.nextInt());
//        conver0_by1(sc.nextInt());
        sum_no_prime(sc.nextInt());
    }

    public static void sum_no_prime(int n) {
        int x = 0;
        for (int i = 2; i <=n/2 ; i++) {
            if (prime(i)) {
                if (prime(n - i)) {
                    System.out.println(i + " " + (n - i));
                    x = 1;
                }
            }
        }
        if (x == 0) {
            System.out.println(n + " cannot be expressed as a sum of two prime numbers");
        }
        
    }

    public static boolean prime(int n) {
        if (n == 2 || n == 1) {
            return true;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void replays0s_by1(int n) {
        int no = 0;
        int newno = 0;
        while (n > 0) {
            if (n % 10 == 0) {
                newno = newno * 10 + (n % 10 + 1);
            } else {
                newno = newno * 10 + (n % 10);
            }
            n /= 10;
        }
        while (newno > 0) {
            no = no * 10 + newno % 10;
            newno /= 10;
        }
        System.out.println(no);
        
    }
    
    public static void conver0_by1(int n) {
        String str = Integer.toString(n);
        str = str.replace('0', '1');
        System.out.println(str);
        
    }
    
    public static void addTwoFactor(int num1, int dem1, int num2, int dem2) {
        int num, den = 0, x;
        if (dem1 == dem2) {
            num = num1 + num2;
            den = dem1;
        } else {
            den = dem1 * dem2;
            num = dem2 * num1 + num2 * dem1;
            
        }
        if (num > den) {
            x = num;
        } else {
            x = den;
        }
        // System.out.println(num+"/ "+den);
        for (int i = 1; i <= x; i++) {
            if (den % i == 0 && num % i == 0) {
                den /= i;
                num /= i;
            }
        }
        int n = 1;
        int p = num;
        int q = den;
        if (num != den) {
            while (n != 0) {
                //storing remainder
                n = num % den;
                if (n != 0) {
                    num = den;
                    den = n;
                }
            }
        }
        System.out.println(num1 + "/" + dem1 + " + " + num2 + "/" + dem2 + " =  (" + p / den + " / " + q / den + ")");
        
    }

    // finding the Hcf highest common factor 
    // gcd  greatest common divisor
    public static int hcf(int x, int y) {
        int hcf = 1;
        for (int i = 1; i <= x || i <= y; i++) {
            if (x % i == 0 && y % i == 0) {
                hcf = i;
            }
        }
        return hcf;
    }

    // lcm leargest common measurment
    public static int lcm(int x, int y) {
        int lcm = 1;
        for (int i = 1; i <= x * y; i++) {
            if (i % x == 0 && i % y == 0) {
                lcm = i;
            }
        }
        return lcm;
    }

    // inary to decimal
    public static int binaryToDecimcal(int bin) {
        int del = 0, pow = 0;
        while (bin > 0) {
            
            del += (int) (bin % 10 * Math.pow(2, pow++));
            bin /= 10;
            
        }
        return del;
    }
    
    public static int octalToDecimcal(int bin) {
        int del = 0, pow = 0;
        while (bin > 0) {
            
            del += (int) (bin % 10 * Math.pow(8, pow++));
            bin /= 10;
            
        }
        return del;
    }
    
    public static int HexadecimalToDecimcal(int bin) {
        int del = 0, pow = 0;
        while (bin > 0) {
            
            del += (int) (bin % 10 * Math.pow(16, pow++));
            bin /= 10;
            
        }
        return del;
    }
    
    public static int decimalTOBinary(int n) {
        int bin = 0, pow = 0;
        while (n > 0) {
            bin += (int) (n % 2 * Math.pow(10, pow++));
            n /= 2;
        }
        return bin;
    }
    
    public static int decimalToOctal(int n) {
        int bin = 0, pow = 0;
        while (n > 0) {
            bin += (int) (n % 8 * Math.pow(10, pow++));
            n /= 8;
        }
        return bin;
    }
    
    public static String decimalToHexadecimal(int n) {
        StringBuilder sb = new StringBuilder("");
        int pow = 0;
        while (n > 0) {
            if (n % 16 > 10) {
                sb.append((char) (55 + n % 16));
            } else {
                sb.append(n % 16);
            }
            
            n /= 16;
        }
        return sb.toString();
    }
    
    public static void binaryToOctal(int n) {
        int decimal = 0, pow = 0;
        while (n > 0) {
            decimal += n % 10 * Math.pow(2, pow++);
            n /= 10;
        }
        System.out.println("decimal" + decimal);
        pow = 0;
        int octal = 0;
        while (decimal > 0) {
            octal += decimal % 8 * Math.pow(10, pow++);
            decimal /= 8;
        }
        System.out.println("octal " + octal);
    }
    
    public static void quadrantLie(int x, int y) {
        if (x > 0 && y > 0) {
            System.out.println(x + " " + y + "  Co-ordinet in frist Quadrant");
            
        }
        if (x < 0 && y > 0) {
            System.out.println(x + " " + y + "  Co-ordinet in secound Quadrant");
            
        }
        if (x < 0 && y < 0) {
            System.out.println(x + " " + y + "  Co-ordinet in third Quadrant");
            
        } else {
            System.out.println(x + " " + y + "  Co-ordinet in fourth Quadrant");
        }
    }
    
    public static int fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    
    public static void permutation(int n, int r) {
        int N = fact(n);
        System.out.println(N);
        int R = fact(n - r);
        System.out.println(R);
        int pr = n / r;
        System.out.println("permutation is" + pr);
    }
    
    public static void handShake(int n) {
        System.out.println(((n - 1) * n) / 2);
    }
    
}
