/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package PrepInstraCoding_Question.recursion_pro_100;



public class Remove_duplicates_Str {

     public static void duplicats(String str , StringBuilder sb, boolean map[],int i){
         if(i==str.length()){
             System.out.println(sb);
             return; 
         }
         if(!map[str.charAt(i)-'a']){
             map[str.charAt(i)-'a']= true;
             sb.append(str.charAt(i));
             duplicats(str, sb, map, i+1);
         }else
         {
             duplicats(str, sb, map, i+1);
         }
         
     }
    public static void main(String args[]) {
        // TODO code application logic here
        duplicats("aabaccabaeedsasd", new StringBuilder(""), new boolean[25], 0);
    }
}
