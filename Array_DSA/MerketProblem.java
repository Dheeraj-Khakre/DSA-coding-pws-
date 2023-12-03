/*A supermarket maintains a pricing format for all its products.
A value N is printed on each product. When the scanner reads the value N on the item,
the product of all the digits in the value N is the price of the item.

The task here is to design the software such that given 
the code of any item N the product (multiplication) of all the digits of value should be computed(price).

Example 1:

Input :

5244 -> Value of N

Output :
160 -> Price 
 */
package Array_DSA;

public class MerketProblem {

    public static void priceN(int n) {
        int price = 1;
        while (n > 0) {

            price *= n % 10;
            n /= 10;
        }
        System.out.println(price);

    }

    public static void main(String args[]) {
        // TODO code application logic here
        priceN(5244);
    }
}
