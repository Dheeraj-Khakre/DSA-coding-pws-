//Last non-zero digit in factorial- C | C++ | Java | Python
package PrepInstraCoding_Question.recursion_pro_100;

public class last_NonZero_Fact {

    public static int fact(int n) {

        return n == 0 ? 1 : n * fact(n - 1);
    }

    public static void main(String args[]) {
        // TODO code application logic here
        int n = 7;
        int fact = fact(n);
        while (fact % 10 == 0) {
            fact /= 10;
        }
        System.out.println("non zero digit of factorial " + fact % 10);
    }
}
