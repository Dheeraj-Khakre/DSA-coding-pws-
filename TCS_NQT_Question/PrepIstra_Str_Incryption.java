/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package TCS_NQT_Question;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class PrepIstra_Str_Incryption {

    public static String strIncrypton(String s, int key) {

        char str[] = s.toCharArray();
        int left = 0;
        if (key == 0) {
            System.out.println("INVALID INPUT");
        } else {
            for (int i = 0; i < str.length; i++) {
                //printf("%d\n", str[i]);
                if (str[i] >= 48 && str[i] <= 57) {
                    if (str[i] + key <= 57) {
                        str[i] = (char) (str[i] + key);
                    } else {
                        left = (str[i] + key) - 57;
                        str[i] = (char) (47 + left);
                    }
                } else if (str[i] >= 65 && str[i] <= 90) {
                    if (str[i] + key <= 90) {
                        str[i] = (char) (str[i] + key);
                    } else {
                        left = (str[i] + key) - 90;
                        str[i] = (char) (64 + left);
                    }
                } else if (str[i] >= 97 && str[i] <= 122) {
                    if (str[i] + key <= 122) {
                        str[i] = (char) (str[i] + key);
                    } else {
                        left = (str[i] + key) - 122;
                        str[i] = (char) (96 + left);
                    }
                }

            }

        }
        return new String(str, 0, str.length);
    }

    public static void main(String args[]) {
        // TODO code application logic here
        int key = new Scanner(System.in).nextInt();
        String str = new Scanner(System.in).nextLine();
        System.out.println(strIncrypton(str, key));
    }
}
