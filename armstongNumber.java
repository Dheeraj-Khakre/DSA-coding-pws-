package loops;

public class armstongNumber {

    public static boolean isArmstrong(int n) {
        int digit = 0, arms = 0;

        int N = n;
        while (n > 0) {
            digit++;
            n /= 10;
        }
        n = N;
        while (N > 0) {
            arms = (int) (arms + Math.pow(N % 10, digit));
            N /= 10;
        }
        return n == arms;
    }
   public static void allArmstong(int lb ,int ub){
       for(int i=lb ; i<=ub;i++){
           if(isArmstrong(i)){
               System.out.println(" "+i);
           }
       }
   }
    public static void main(String args[]) {
        // TODO code application logic here
        System.out.println(" " + isArmstrong(370));
        allArmstong(0, 1000);
    }
}
