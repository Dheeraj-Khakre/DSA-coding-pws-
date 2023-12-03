package TCS_NQT_Question;

import java.util.Scanner;

public class Step_Count {

    public static void stapCount(int n) {
        int x = 0, y = 0,dis=10;
        char ch='R';
        
        for (int i = 1; i <= n; i++) {
            switch (ch) {
                case 'R' :
                    x+=dis;
                    dis+=10;
                    ch='U';
                    break;
                case 'U' :
                    y+=dis;
                    dis+=10;
                    ch='L';
                    break;
                case 'L' :
                    x-=dis;
                    dis+=10;
                    ch='D';
                    break;
                case 'D' :
                    y-=dis;
                    dis+=10;
                    ch='A';
                    break;
                case 'A' :
                    x+=dis;
                    dis+=10;
                    ch='R';
                    break;
                
            }

    
        }
        System.out.println(x + ", " + y);

    }

    public static void main(String args[]) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the step ");
        
        stapCount(sc.nextInt());
    }
}
//        if (i == 1 || i-pr==5  ) {
//                x = x + (10 + (i - 1) * 10);
//                pr = i;
//            } else if (i == 2 || i-pup==5) {
//                y = y + (10 + (i - 1) * 10);
//                pup = i ;
//
//            } else if (i == 3 || i-pl==5) {
//                x = x - (10 + (i - 1) * 10);
//                pl = i;
//              //  System.out.println("x=" + x);
//            } else if (i == 4 || i-pd==5) {
//                y = y - (10 + (i - 1) * 10);
//                pd = i;
//            } else if (i == 5 ||i-pR==5) {
//                x = x + (10 + (i - 1) * 10);
//                pR = i;
//            }