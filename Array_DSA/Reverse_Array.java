
package Array_DSA;

public class Reverse_Array {
    public static void main(String[] args) {
        int x[]={1,3,6,4,7,2,45,9,8};
        int j=x.length-1;
        for(int i=0;i<x.length/2;i++,j--){
            int a=x[j];
            x[j]=x[i];
            x[i]=a;
        }
        for(int i=0;i<x.length;i++){
            System.out.print(" "+x[i]);
        }
    }
            
    
}
