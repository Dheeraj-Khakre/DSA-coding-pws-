/*
 * 
String s1="845156845856845" what is the remender of dividig by String s2="6";....
 */
package TCS_NQT_Question;

import java.math.BigInteger;

public class StrRemender {

    
  public static void bigInteger(String s1,String s2){
      BigInteger n1=new BigInteger(s1);
      BigInteger n2=new BigInteger(s2);
      BigInteger rem= n1.remainder(n2);
      System.out.println(rem);
      
  }
    public static void main(String args[]) {
        // TODO code application logic here
        String s1 = "1445845623562852652582652652";
        String s2 = "12";
        
      //  System.out.println(strRemender(s1, s2));
        bigInteger(s1, s2);

    }
}
