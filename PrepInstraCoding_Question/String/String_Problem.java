package PrepInstraCoding_Question.String;

import java.util.HashMap;
import java.util.Map;

public class String_Problem {

//   Check whether a character is a vowel or consonant : C | C++ | Java | Python
    public static void chackV_C(String str) {
        str = str.toLowerCase();
        StringBuilder v = new StringBuilder();
        StringBuilder c = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                v.append(ch);
            } else {
                c.append(ch);
            }
        }
        System.out.println("vowels  in String " + v);
        System.out.println("consonent in String " + c);
    }
//Check whether a character is a alphabet or not : C | C++ | Java | Python

    public static boolean isAlphabet(String str) {
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!(ch <= 'z' && ch <= 'a') || ch != ' ') {
                return false;
            }

        }
        return true;
    }
//Find the ASCII value of a character : C | C++ | Java | Python

    public static void asciiValue(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print((int) str.charAt(i) + " ");
        }
    }
//Length of the string without using strlen() function : C | C++ | Java | Python

    public static void isLength(String str, int i) {
        if (str.equals("")) {
            System.out.println(" length of the String is " + i);
            return;
        }
        isLength(str.substring(1), i + 1);
    }
//Toggle each character in a string : C | C++ | Java | Python

    public static String toggleString(String str) {
        StringBuilder bs = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                bs.append(Character.toLowerCase(ch));
            } else {
                bs.append(Character.toUpperCase(ch));
            }

        }
        return bs.toString();
    }
//Count the number of vowels : C | C++ | Java | Python

    public static int countVowels(String str) {
        str = str.toLowerCase();
        int vc = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vc++;
            }
        }
        return vc;
    }

//Remove the vowels from a String : C | C++ | Java | Python
    public static String removeVowels(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                sb.append(ch);
            }

        }
        return sb.toString();
    }
//Check if the given string is Palindrome or not : C | C++ | Java | Python

    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
//Print the given string in reverse order : C

    public static String reverseStr(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
//    Remove all characters from string except alphabets : C | C++ | Java | Python

    public static String removechar(String str) {
        return str.replaceAll("[^A-Za-z]", "");
    }
//Remove spaces from a string : C | C++ | Java | Python

    public static String removeSpace(String str) {
        return str.replaceAll("[//s]", "");
    }
//Remove brackets from an algebraic expression : C | C++ | Java | Python

    public static String removebrackes(String str) {
        return str.replaceAll("[(){}]", "");
    }
//Count the sum of numbers in a string : C | C++ | Java | Python

    public static int sumOfStr_Nu(String str) {
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            sum += Integer.parseInt(str.charAt(i) + "");
        }
        return sum;

    }
//Capitalize the first and last character of each word of a string : C | C++ | Java | Python

    public static String capitalize_Last_frist(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toUpperCase(str.charAt(0)));
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) == ' ' && str.charAt(i) != ' ') {

                sb.append(Character.toUpperCase(str.charAt(i)));

            } else if (str.charAt(i - 1) != ' ' && str.charAt(i) == ' ') {

                sb.append(Character.toUpperCase(str.charAt(i - 1)));

            } else {
                sb.append(str.charAt(i));

            }

        }

        return sb.toString();

    }
//Calculate frequency of characters in a string : C | C++ | Java | Python

    public static void frequencyStr(String str) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (hm.containsKey(str.charAt(i))) {
                hm.put(str.charAt(i), hm.get(str.charAt(i)) + 1);
            } else {
                hm.put(str.charAt(i), 1);
            }
        }
        System.out.println(" frequvancy of String element " + hm);
    }
//Find non-repeating characters in a string : C | C++ | JAVA | Python

    public static void nonRepeating(String str) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (hm.containsKey(str.charAt(i))) {
                hm.put(str.charAt(i), hm.get(str.charAt(i)) + 1);
            } else {
                hm.put(str.charAt(i), 1);
            }
        }
        for (Map.Entry<Character, Integer> e : hm.entrySet()) {
            if (e.getValue() == 1) {
                System.out.print(e.getKey() + " ");
            }
        }

    }
//Check if two strings are Anagram or not 

    public static void main(String args[]) {

        String str = "Dheeraj Khakre DK";
        String s1 = str.replaceAll("[\\s]", "");
        System.out.println(s1);
        chackV_C(str);
        System.out.println("is alphabetic  " + isAlphabet(str));
        asciiValue(str);
        isLength(str, 0);
        System.out.println("length = " + str.length());
        System.out.println(" Toggle String " + toggleString(str));
        System.out.println("no. of vowels in the String is " + countVowels(str));
        System.out.println("String is palindrome  = " + isPalindrome("moom"));
        System.out.println("Reverse String " + reverseStr(str));
        System.out.println("Remove all characters from string except alphabets " + removechar("dh2341ee@3r^A*J"));
        System.out.println(" number sum " + sumOfStr_Nu("12345"));
        System.out.println(" Capitaizeation of last and firs char. in Sting " + capitalize_Last_frist("dheeraj khakre dk"));
        frequencyStr("dddhheeeerraj");
        nonRepeating("kdddhheeeerraj");
    }

}
