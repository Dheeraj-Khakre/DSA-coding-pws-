package TCS_NQT_Question;

import java.util.Scanner;

public class StrMissing_ele {

    public static void strmissingele(String str) {
        str=str.toLowerCase();
        boolean chS[] = new boolean[26];
        //  boolean chC[]=new boolean[26];
        for (int i = 0; i < str.length(); i++) {
            
            if(str.charAt(i)!=' '){
              
                 if (chS[str.charAt(i) - 'a'] != true) {
                chS[str.charAt(i) - 'a'] = true;
            }
                 
            }

        }
        System.out.println("missing element");
        for (int i = 0; i < 26; i++) {
            if (chS[i] == false) {
                System.out.print((char) (i + 97) + "");
            }
        }
    }

    public static void main(String args[]) {
        // TODO code application logic here
        String str = new Scanner(System.in).nextLine();
        System.out.println("value of String ");
        strmissingele(str);
    }
}
