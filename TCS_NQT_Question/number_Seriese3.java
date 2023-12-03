/*
 *
0,0,2,1,4,2,6,3,8,4,10...find the nth position,,...??
 */
package TCS_NQT_Question;

public class number_Seriese3 {

    public static int noSerise(int n) {
        int a = 0, b = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                if (i > 1) {
                    a += 2;
                }
            } else {
                b = a / 2;
            }

        }
        if (n % 2 == 0) {
            return b;
        } else {
            return a;
        }
    }

    public static void main(String args[]) {
        // TODO code application logic here
        System.out.println(noSerise(7));
    }
}
