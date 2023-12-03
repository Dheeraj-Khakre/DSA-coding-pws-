/*
the number series is . = 1,1,2,3,4,9,8,27,32,81,64,....find the nth terms 
 */
package TCS_NQT_Question;


public class Number_Series {

    public static int numberSeriesNturms(int n){
        int a=0,b=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                if(i==1){
                    a=1;
                    System.out.print(a+" ");
                }else{
                    a*=2;
                    System.out.print(a+" ");
                }
            }else{
              if(i==2){
                  b=1;
                  System.out.print(b+" ");
              }else{
                  b*=3;
                  System.out.print(b+" ");
              }
            }
        }
        System.out.println();
        if(n%2==0){
            return b;
        }else
            return a;
        
    }
    public static void main(String args[]) {
       
        System.out.println(numberSeriesNturms(10));
                
       
    }
}
