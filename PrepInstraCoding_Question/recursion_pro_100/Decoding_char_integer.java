/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package PrepInstraCoding_Question.recursion_pro_100;

public class Decoding_char_integer {

    public static void decoding(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            count++;
            return ;
        }else{
        for (int i = 0; i < str.length(); i++) {
            String prix = str.substring(0, i + 1);
            String newstr = str.substring(i + 1);
            if (Integer.parseInt(prix) <= 26) {
                int a = ('a' + Integer.parseInt(prix) - 1);
                 decoding(newstr, ans + (char) a);
            }
        }
        }

    }
static int count=0;
    public static void main(String args[]) {
        // TODO code application logic her
        
        
        
         decoding("123", "");
         System.out.println("possible way to decoding "+count);
    }
}
