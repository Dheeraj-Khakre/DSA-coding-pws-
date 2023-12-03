
package Array_DSA;


public class RemoveSAmeString {
    public static String SameElem_Remove(StringBuilder sb, StringBuilder sb2){
        StringBuilder temp =new StringBuilder("");
       int i=0;
       int j=0 ;
         
       while(i<sb.length() &&  j<sb2.length()){
           if(sb.charAt(i)!=sb2.charAt(j)){
               temp.append(sb.charAt(i));
           } 
         if(i<sb.length()){
             i++;
         }
         if(i<sb2.length()){
             j++;
         }
          
          
          
          
       }
       return temp.toString();
    }

    
    public static void main(String args[]) {
        // TODO code application logic here
        StringBuilder sb =new StringBuilder("dkasdnight sky");
        StringBuilder sb2 =new StringBuilder("dkerdnight s");
        System.out.println(" "+ SameElem_Remove(sb, sb2));
    }
}
