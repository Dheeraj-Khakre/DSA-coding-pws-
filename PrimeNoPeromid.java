//rite a program to print a triangle of prime numbers upto given number of lines of the trinagle
package loops;

public class PrimeNoPeromid {

    public static boolean isPrime(int n) {
        if (n < 1) {
            return false;
        }
        if (n == 2) {
            return true;

        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static void primePeromid(int row) {
        int track = 2, x = 1;

        for (int i = 1; i <= row; i++) {
            for (int j = row+i; j >= x; j--) {
                System.out.print("   ");
            }
            for (int j = 1; j <= x; j++) {
                while(isPrime(track)!=true){
                    track++;
                }
                System.out.print(" "+track+" ");
                track++;

            }
            System.out.println();
            x += 2;
            
            
        }
    }

    public static void main(String args[]) {
        // System.err.println(isPrime(4));
        primePeromid(5);
    }
}
