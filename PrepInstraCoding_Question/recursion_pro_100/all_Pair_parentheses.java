/*
//Given an integer N representing the number of pairs of parentheses,
the task is to generate all combinations of well-formed(balanced) parentheses – C | C++ | Java | Python


 */
package PrepInstraCoding_Question.recursion_pro_100;

public class all_Pair_parentheses {

    public static void parentheses_Pair(int n, String str, int o, int c) {
        if (c == n && o == n) {
            System.out.println(str);
        }
        if (o < n) {
            parentheses_Pair(n, str + '{', o + 1, c);
        }
        if (c < o) {
            parentheses_Pair(n, str + '}', o, c + 1);
        }
    }

    public static void main(String args[]) {
        // TODO code application logic here
        parentheses_Pair(3, "", 0, 0);
    }
}
