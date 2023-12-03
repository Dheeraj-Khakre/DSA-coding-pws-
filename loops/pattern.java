package loops;

import java.util.Scanner;

public class pattern {
//- Write a program to print pattern given below

    public static void pattern(int row) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                if (row / 2 == i || row / 2 == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    /*6- Write a program to print alphabet diamond pattern:
    
     A
    ABC
   ABCDE
  ABCDEFG
 ABCDEFGHI
  ABCDEFG
   ABCDE
    ABC
     A
     */
    public static void alphabetDiamondPattern(int row) {
        char ch = 'A';
        int x = 1;
        for (int i = 1; i <= row * 2; i++) {
            if (i <= row / 2 && i >= 1) {
                for (int j = row + i; j >= x; j--) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= x; j++) {
                    System.out.print(ch++ + " ");
                }
                
            } else {
                for (int j = row + i; j >= x; j--) {
                    System.out.print(ch++ + " ");
                }
                for (int j = 1; j <= x; j++) {
                    System.out.print("  ");
                    
                }
                
            }
            x += 2;
            System.out.println();
            ch = 'A';
        }
    }
    ///print X petterns 

    public static void xPatterns(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                if (i + j - 1 == row || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("******");
//
//        }
//        System.out.println();
//        for (int i = 1; i <= 5; i++) {
//            for (int j = i; j <= 5; j++) {
//                System.out.print(" ***");
//            }
//            System.out.println();
//
//            for (int j = 1; j <= i; j++) {
//                System.out.print("  ");
//            }
//
        //    }

        //   xPatterns(sc.nextInt());
        alphabetDiamondPattern(5);
        pattern(7);
        
    }
}
