/*
 * Problem Statement – An automobile company manufactures both a two wheeler (TW) and a four wheeler (FW). A company manager wants to make the production of both types of vehicle according to the given data below:

1st data, Total number of vehicle (two-wheeler + four-wheeler)=v
2nd data, Total number of wheels = W
The task is to find how many two-wheelers as well as four-wheelers need to manufacture as per the given data.
Example :

Input :
200  -> Value of V
540   -> Value of W

Output :
TW =130 FW=70

Constraints :

2<=W
W%2=0
V<W
 */
package TCS_NQT_Question;

import java.util.Scanner;

public class wheels_Problem {

    public static void findVihcles(int v, int wheels) {
        int Tw = 0, Fw = v;
        if (2 <= wheels && wheels % 2 == 0) {
            System.out.println("INVALID INPUT");
            return;
        } else if (v < wheels) {

            System.out.println("INVALID INPUT");
            return;
        }
    

    
        else {
                 while ((Tw * 2 + Fw * 4) != wheels) {
            Tw++;
            Fw--;
        }
        System.out.println("four wheerals =" + Fw);
        System.out.println("Two wheerals =" + Tw);

    }

}

public static void main(String args[]) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
             int v=sc.nextInt();
             int w=sc.nextInt();
             float res=((4*v)-w)/2;
             if(w>=2 && (w%2==0) && v<w)              
             System.out.println("TW= "+(int)(res)+" FW= "+(int)(v-res));
             else                
             System.out.println("INVALID INPUT");
        findVihcles(20, 68);
    }
}
