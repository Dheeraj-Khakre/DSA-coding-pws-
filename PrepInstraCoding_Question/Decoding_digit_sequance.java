/*
 1 = A, 2 = B, 3 = C, . . . . , 26 = Z.
The decoding programs are the most possible questions asked and are largely practiced in C  programming. The program counts the number of possible decoding’s of the entered digit by the user of the given sequence.
For example :- if the digit sequence is “12” then there are two possible decoding’s for this – One of them is ‘AB’ when we decode 1 as ‘A’ and 2 as ‘B’. Now we can also decode this digit sequence “12” as ‘L’ when we decode digits 1 and 2 taken together as an integer 12.

Now let’s take another example for reference,

Sequence = 131

Possible decoding (1, 3, 1,)    = ACA
Possible decoding (13, 1)   = MA
So, the total possible decoding’s of sequence 131 is 2.
 */
package PrepInstraCoding_Question;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Decoding_digit_sequance {

    // Function to count possible decodings
    public static int countDecodings(String digits) {
        int n = digits.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            // Check if the current digit is a valid single-digit number
            if (digits.charAt(i - 1) != '0') {
                dp[i] = dp[i - 1];
            }

            // Check if the current and previous digit form a valid double-digit number
            if (digits.charAt(i - 2) == '1' || (digits.charAt(i - 2) == '2' && digits.charAt(i - 1) <= '6')) {
                dp[i] += dp[i - 2];
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        String digits = new Scanner(System.in).next();
        int possibleDecodings = countDecodings(digits);
        System.out.println("Number of possible decodings: " + possibleDecodings);
    }
}
