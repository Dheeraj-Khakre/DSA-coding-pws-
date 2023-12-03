/*
 
The Caesar cipher is a type of substitution cipher in which each alphabet in the plaintext or messages is shifted by a number of places down the alphabet.
For example,with a shift of 1, P would be replaced by Q, Q would become R, and so on.
To pass an encrypted message from one person to another, it is first necessary that both parties have the ‘Key’ for the cipher, so that the sender may encrypt and the receiver may decrypt it.
Key is the number of OFFSET to shift the cipher alphabet. Key can have basic shifts from 1 to 25 positions as there are 26 total alphabets.
As we are designing custom Caesar Cipher, in addition to alphabets, we are considering numeric digits from 0 to 9. Digits can also be shifted by key places.
For Example, if a given plain text contains any digit with values 5 and keyy =2, then 5 will be replaced by 7, “-”(minus sign) will remain as it is. Key value less than 0 should result into “INVALID INPUT”

Example 1:
Enter your PlainText: All the best
Enter the Key: 1

The encrypted Text is: Bmm uif Cftu
 */
package TCS_NQT_Question;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Str_key_Incryption {

    public static String strIncryption(String str, int key) {
        if (key == 0) {
            System.out.println("INVAILID INPUT");
            return "";
        }
        int temp = 0;
        char ch[] = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != ' ') {
                if (ch[i] <= 57 && ch[i] >= 48) {
                    if (ch[i] + key <= 57) {
                        ch[i] = (char) (ch[i] + key);
                    } else {

                        temp = ch[i] + key - 57;
                        ch[i] = (char) (temp + 47);
                    }
                }
                if (ch[i] <= 'z' && ch[i] >= 'a') {
                    if (ch[i] + key > 122) {
                        temp = ch[i] + key - 122;
                        ch[i] = (char) (temp + 96);
                    } else {
                        ch[i] = (char) (ch[i] + key);
                    }
                } else if (ch[i] <= 'Z' && ch[i] >= 'A') {
                    if (ch[i] + key > 90) {
                        temp = ch[i] + key - 90;
                        ch[i] = (char) (temp + 64);
                    } else {
                        ch[i] = (char) (ch[i] + key);
                    }
                }

            }
        }
        return new String(ch, 0, ch.length);

    }

    public static void main(String args[]) {
        // TODO code application logic here
        int key = new Scanner(System.in).nextInt();
        String str = new Scanner(System.in).nextLine();
        System.out.println(strIncryption(str, key));
    }
}
