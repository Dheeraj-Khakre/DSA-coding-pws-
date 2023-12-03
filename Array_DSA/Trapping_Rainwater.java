
package Array_DSA;


public class Trapping_Rainwater { 
    public static void trapWater(int height[]){
    
        // 1 -find the left max boundery = helper array 
    int leftmax[]=new int[height.length];
    leftmax[0]=height[0];
    for(int i=1;i<height.length;i++){
        leftmax[i]=Math.max(leftmax[i-1], height[i]);
    }
        // 2 -find the right  max boundery = helper array 
        int rigtmax[]=new int[height.length];
        rigtmax[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            rigtmax[i]=Math.max(height[i], rigtmax[i+1]);
        }
        int trapwater=0;
        for (int i = 0; i < height.length; i++) {
            int waterlevel=Math.min(leftmax[i], rigtmax[i]);
            trapwater+=waterlevel-height[i];
            
            
        }
        System.out.println("total trapped water is = "+trapwater);
    //3- loop 
    //waterlevel =Math.max(leftmax bound ,right max bound)
            }
    public static void main(String[] args) {
        int hieght[]={4,2,0,6,3,2,5};
        trapWater(hieght);
    }
            
    
}
 