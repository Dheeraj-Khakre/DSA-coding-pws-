
package Array_DSA;

public class Maximun_Subarray {
    public static void main(String[] args) {
        int x[]={-1,3,6,4,7,-2,-4,-9,8};
        int cursum=0, max=Integer.MIN_VALUE;
        for (int i = 0; i <x.length; i++) {
            cursum+=x[i];
            if(cursum<0)
            {
                cursum=0;
            }
            if(cursum>max){
                max=cursum;
            }
            
        }
        System.out.println(" maximun subarray "+max );
    }
    
}
