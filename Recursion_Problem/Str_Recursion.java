package Recursion_Problem;

import java.util.Scanner;

public class Str_Recursion {

    // remove occurrance of given charactor form String 
    static String removeOccur(String s, char ch) {
        if (s.length() == 0) {
            return "";
        }
        String ans = removeOccur(s.substring(1), ch);
        char c = s.charAt(0);

        if (s.charAt(0) != ch) {
            return c + ans;
        } else {
            return ans;
        }

    }

    // revrese String 
    static String revreseStr(String s) {
        if (0 == s.length()) {
            return "";
        }
        return revreseStr(s.substring(1)) + s.charAt(0);

    }

    static boolean isPalindrom(String s, int i) {
        if (i == s.length() / 2) {
            return true;
        }
        if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
            return false;
        }
        return isPalindrom(s, i + 1);

    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string ");
        //  String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        // System.out.println(removeOccur(sc.nextLine(), sc.next().charAt(0)));
        //System.out.println(revreseStr(sc.nextLine()));
        //  System.out.println(isPalindrom(sc.nextLine(), 0));
        //  System.out.println(marging2Str(s1, s2, new StringBuilder(), s1.length() + s2.length()));
        //  System.out.println(upperCasLatter(s2, 0));
       //  System.out.println(totallowerCas(s2,0));
      //  System.out.println(totalConsonent(s2.toLowerCase()));
      System.out.println(parseInt(s2, 0));
       
    }

    // assignment question  based on String 
    // q1 Q1. Write a program to merge 2 strings alternately using recursion starting from the first input string.
    static String marging2Str(String s1, String s2, StringBuilder sb, int n) {
        if (sb.length() == n) {
            return sb.toString();
        }
        String new1 = "", new2 = "";
        if (s1.length() > 0) {
            sb.append(s1.charAt(0));

            new1 = s1.substring(1);
        }
        if (s2.length() > 0) {
            sb.append(s2.charAt(0));

            new2 = s2.substring(1);
        }
        return marging2Str(new1, new2, sb, n);
    }

    //Q2. Given a string, find its first uppercase letter and return the remaining substring, starting from
//the uppercase letter.
    static String upperCasLatter(String s, int i) {
        if (s.length() == i) {
            return "";
        }
        if (i != 0 && s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
            return s.substring(i);
        }
        return upperCasLatter(s, i + 1);
    }

    //Given a string, count total number of consonants in it. A consonant is an English alphabet
//character that is not vowel (a, e, i, o and u). Examples of constants are b, c, d, f, and g.
    static int totalConsonent(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int x = 0;
        char ch = s.charAt(0);
        if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
            x = 1;

        }
        return totalConsonent(s.substring(1)) + x;
    }

    //Given a string, return the number of lowercase characters in it using recursion.
    static int totallowerCas(String s,int i) {
        if (s.length() == i) {
            return 0;
        }
        int x = 0;
        char ch = s.charAt(i);
        if (ch >= 'a' && ch <= 'z') {
            x = 1;

        }
        return  x +  totallowerCas(s,i+1);
    }
    //Q5. Given a string, recursively implement atoi() or Integer.parseInt() method on it without actually
//using the method.
    static int  parseInt(String s,int i){
         if(s.length()==i)
             return 0;
         
         return  (s.charAt(i)-48)*(int)Math.pow(10, s.length()-1-i)+ parseInt(s, i+1);
    }
    // output in integer "123" - 123
}
