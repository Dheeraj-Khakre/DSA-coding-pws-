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
public class Str_subStr_Remove {

    public static void strRemover(String str, String sub) {
        str=str.toLowerCase();
        StringBuilder result = new StringBuilder();
     boolean ch[]=new boolean[26];
     for(int i=0;i<sub.length();i++){
         if(ch[sub.charAt(i)-'a']!=true){
            ch[sub.charAt(i)-'a']=true; 
         }
     }
     for(int i=0;i<str.length();i++){
         if(ch[str.charAt(i)-'a']!=true){
             result.append(str.charAt(i));
         }
     }
       
     System.out.println(result);  

    }

    public static void main(String args[]) {
        // TODO code application logic here
        String str = new Scanner(System.in).nextLine();
        String sub = new Scanner(System.in).next();
        strRemover(str, sub);
    }
}
