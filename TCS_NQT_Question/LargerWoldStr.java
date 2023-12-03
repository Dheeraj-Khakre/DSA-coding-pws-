/*
 * 
  lerger  world in the string 

  str= the dk mod night sky
  5=night output;

 */
package TCS_NQT_Question;



public class LargerWoldStr {

      public static String lergeword(String str){
          
          String str2[]=str.split(" ");
          String result="";
          
          for(int i=0;i<str2.length;i++){
              if(result.length()<str2[i].length())
              {
                  result=str2[i];
              }
          }
          return result;
          
      }
     public static int lergeWordStr(String str ){
         int count=0;
         int max=0;
         for(int i=0;i<str.length();i++){
             while(str.charAt(i)!=' '){
                 count++;
                 i++;
             }
             if(count>max){
                 max=count;
             }
             count=0;
         }
         return max;
     }
     
    public static void main(String args[]) {
        String str ="dk mid night worlds ";
        System.out.println(lergeWordStr(str));
        System.out.println(lergeword(str));
       
        
    }
}
