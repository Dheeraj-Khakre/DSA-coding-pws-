/*
 * 
At a fun fair, a street vendor is selling different colours of balloons. He sells N number of different colours of balloons (B[]). The task is to find the colour (odd) of the balloon which is present odd number of times in the bunch of balloons.

Note: If there is more than one colour which is odd in number, then the first colour in the array which is present odd number of times is displayed. The colours of the balloons can all be either upper case or lower case in the array. If all the inputs are even in number, display the message “All are even”.

Example 1:

7  -> Value of N
[r,g,b,b,g,y,y]  -> B[] Elements B[0] to B[N-1], where each input element is sepārated by ṉew line.
 */
package TCS_NQT_Question;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Balloons_Problem {

    public static void findOldColor(char ch[]) {
        int lower[] = new int[26];
        int upper[] = new int[26];
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'a' && ch[i] <= 'z') {
                lower[ch[i] - 'a']++;
            } else if (ch[i] >= 'A' && ch[i] <= 'Z') {
                upper[ch[i] - 'A']++;
            }

        }

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'a' && ch[i] <= 'z') {
                if (lower[ch[i] - 'a'] % 2 != 0) {
                    System.out.println("old color is = " + ch[i]);
                    return;

                }
            } else if (ch[i] >= 'A' && ch[i] <= 'Z') {
                if (upper[ch[i] - 'a'] % 2 != 0) {
                    System.out.println("old color is = " + ch[i]);
                    return;

                }
            } else {
                System.out.println("all are even");
                return;
            }

        }

    }

    public static void main(String args[]) {
        // TODO code application logic here
        int n = new Scanner(System.in).nextInt();
        char arr[] = new char[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Scanner(System.in).next().charAt(0);
        }
        findOldColor(arr);

    }
}
