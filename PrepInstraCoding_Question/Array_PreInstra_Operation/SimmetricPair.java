/*
 Symmetric Elements in an Array in Java
Here, in this page we will discuss the program to find all symmetric elements in an array in Java programming language. We are given with pairs and need to print those pairs which are symmetric.

Symmetic elements in an array
Explanation :
We are given with an array pairs, inside that array some symmetric pairs exist. The problem statement says that we have to find all symmetric pairs that exist in array. we can simply use two loops and traverse the 2d array.
Example,
Input : arr[5][2] = {{10,20}, {30,40}, {50,60}, {20,10}, {40,30}}
Output : (10,20) (30,40)
 */
package PrepInstraCoding_Question.Array_PreInstra_Operation;

import java.util.HashMap;

public class SimmetricPair {

    public static void simmetricPairArr(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                if (matrix[i][0] == matrix[j][1] && matrix[i][1] == matrix[j][0]) {
                    System.out.println(" simmetric pair (" + matrix[i][0] + "," + matrix[i][1] + ")");
                }
            }
        }
    }

    // by using hashmap..
    public static void simPair_HM(int m[][]) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < m.length; i++) {
            if (hm.get(m[i][0]) != null && hm.get(m[i][1]) == m[i][0]) {
                System.out.println("(" + m[i][0] + "," + m[i][1] + ")");
            } else {
                hm.put(m[i][0], m[i][1]);
            }
        }
    }

    public static void main(String args[]) {
        // TODO code application logic here
        int matrix[][] = {{10, 20}, {20, 30}, {30, 40}, {40, 50}, {20, 10}};
        simmetricPairArr(matrix);
        simPair_HM(matrix);
    }
}
