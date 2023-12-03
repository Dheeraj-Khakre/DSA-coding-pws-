package Recursion_Problem;

public class Lactual_31_Q {
// greatest common factor 
    static int gcd(int x, int y) {
        return  y == 0 ? x : gcd(y, x % y);
    }
    static int lcm(int x, int y){
        return (x/gcd(x, y))*y;
    }
    static int decimalToBinary(int n){
        
      
        if(n==0)return 0;
        return n%2+10*decimalToBinary(n/2);
    }
     public static int binaryToDecimal(int binary) {
 
        // if binary number become 0
        if (binary == 0) {
            return 0;
        }
 
        return (binary % 10 + 2 * binaryToDecimal(binary / 10));
    }
 
    static int binaryToDec(int n){
        
      
        if(n==0)return 0;
        return n%10+2*binaryToDec(n/10);
    }

    public static void main(String args[]) {
        System.out.println(decimalToBinary(5));
        System.out.println(binaryToDec(101));
        System.out.println(binaryToDecimal(101));
        
//        System.out.println(gcd(15, 24));
//        System.out.println(lcm(15, 24));
                
    }
}
