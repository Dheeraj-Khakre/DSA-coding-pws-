package TCS_NQT_Question;

public class Multipule_Sum {

    public static void main(String args[]) {
        // TODO code application logic here
        int n = 55;
        long p = 1;
        while (n % 3 != 0) {
            n -= 2;
            p *= 2;

        }
        System.out.println(p * Math.pow(3, n / 3));

    }
}
