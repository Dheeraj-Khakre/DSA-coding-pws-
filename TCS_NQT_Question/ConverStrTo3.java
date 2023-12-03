/*
 * 
 String contain 3 word convert into 1 word all vowels ito % and second into all consonents into # 
and last word conver itno upper case 
 */
package TCS_NQT_Question;

/**
 *
 * @author hp
 */
public class ConverStrTo3 {

    public static String strConverson(String str) {
        String ans[] = str.split(" ");
        String result = "";
        char ch[] = ans[0].toCharArray();
        for (int i = 0; i < ch.length; i++) {

            if ((ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') || ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
                ch[i] = '%';

            }

        }
        result = new String(ch, 0, ch.length);
        ch=ans[1].toCharArray();
        for (int i = 0; i < ch.length; i++) {
            switch (ch[i]) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    break;
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    break;
                default:
                    ch[i]='#';
                    break;
            }


            
        }
          result += new String(ch, 0, ch.length);
       
          
             result+= ans[2].toUpperCase();
        
        return result;
    }

    public static void main(String args[]) {
        // TODO code application logic here
        String str = "how are you";
        System.out.println(str);
                
        System.out.println(strConverson(str));

    }
}
