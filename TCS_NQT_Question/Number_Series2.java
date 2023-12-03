/*
input = 1478 

output = 1*4*7*8= 226 
 */
package TCS_NQT_Question;


public class Number_Series2 {
    // iteretor 
    public static int number1(int n){
        int multi=1;
        while(n>0){
            int ld=n%10;
            multi*=ld;
            n/=10;
        }
        return multi;
    }
   /// by recursion ..
    public static int  number(int n){
       if(n==0){
           return 1;
       }
       return ( n%10 )*number(n/10);
   }
    public static void main(String args[]) {
       int n=7415;
       System.out.println("product of element "+number(n));
       System.out.println("product of element "+number1(n));
    }
}
