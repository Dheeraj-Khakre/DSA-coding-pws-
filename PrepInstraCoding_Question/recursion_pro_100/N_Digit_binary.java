/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package PrepInstraCoding_Question.recursion_pro_100;

/**
 *
 * @author hp
 */
public class N_Digit_binary {

    public static void ndigit_bin(int n, String ans, int ld) {
        if (n == 0) {
            System.out.println(ans);
            return;
        }

        if (ld > 0) {

            ndigit_bin(n - 1, ans + "0", ld - 1);
        }
        ndigit_bin(n - 1, ans + "1", ld + 1);

    }

    public static void main(String args[]) {
        // TODO code application logic here
        System.out.println("");
        ndigit_bin(4, "", 0);
    }
}
