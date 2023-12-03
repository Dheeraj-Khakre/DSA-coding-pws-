/*
intput =13INR
output 
6 1 3 2 
6= total no. of coine 
1= 5 rs no. of coine 
3= 2rs no. of coine '
2= 1 rs no. of coine 

 */
package TCS_NQT_Question;

import java.util.Scanner;



public class CoineProblem {

    public static void totalCoines(int n){
        int one=0,two=0;
        int five = (n-4)/5;
        
        if((n-five*5)%2==0){
            one=2;
        }else{
            one=1;
        }
        two= (n-5*five-one)/2;
        System.out.println(one+two+five);
        System.out.println(five);
        System.out.println(two);
        System.out.println(one);
    }
    public static void main(String args[]) {
        // TODO code application logic here
        System.out.println("enter  rupees ");
        int inr=new Scanner(System.in).nextInt();
        totalCoines(inr);
    }
}
