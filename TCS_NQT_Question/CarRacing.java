

package TCS_NQT_Question;

import java.awt.PageAttributes;
import java.util.Scanner;


public class CarRacing {

  
    
    public static void main(String args[]) {
        // TODO code application logic here
        System.out.println("enter value n1");
        int n1=new Scanner(System.in).nextInt();
        System.out.println("enter the value n2");
        int n2=new Scanner(System.in).nextInt();
        System.out.println("enter value x");
        int x=  new Scanner(System.in).nextInt();
        int car1=x;
        int car2=0;
        ///first secound 
        car1+=n1;
        car2+=n2;
        car1+=n1;
        car2+=n2;
        if(car1-car2<0){
            System.out.println("-1");
        }else{
            System.out.println(car1-car2);
        }

    }
}
