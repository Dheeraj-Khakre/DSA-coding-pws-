/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package PrepInstraCoding_Question.recursion_pro_100;



public class subSet_Integer {

    public static void subset(String str, String ans,int i){
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        
       
            
        subset(str, ans+str.charAt(i),i+1);
            subset(str, ans,i+1);
          
        
    }
    public static void main(String args[]) {
        // TODO code application logic here
        subset("123", "",0);
    }
}
