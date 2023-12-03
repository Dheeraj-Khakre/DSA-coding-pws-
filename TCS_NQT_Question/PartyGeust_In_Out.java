/*
 *A party has been organised on cruise. The party is organised for a limited time(T). The number of guests entering (E[i]) and leaving (L[i]) the party at every hour is represented as elements of the array. The task is to find the maximum number of guests present on the cruise at any given instance within T hours.

Example 1:
Input :

5    -> Value of T
[7,0,5,1,3]  -> E[], Element of E[0] to E[N-1], where input each element is separated by new line 
[1,2,1,3,4]   -> L[], Element of L[0] to L[N-1], while input each element is separate by new line.
Output :
8     -> Maximum number of guests on cruise at an instance.
 */
package TCS_NQT_Question;

import java.util.Scanner;



public class PartyGeust_In_Out {

    
    public static int totalGeust(int e[],int l[]){
       int geust=0;
        int total=0;
        for(int i=0;i<l.length;i++){
           
            total= total+ (e[i]-l[i]);
            geust=Math.max(geust, total);
                    
        }return geust;
                
    }
    public static void main(String args[]) {
        // TODO code application logic here
      //  int x=new Scanner(System.in).nextInt();
         int enter[]={7,0,5,1,3};
        int leave[]={1,2,1,3,4};
         
//        for(int i=0;i<x;i++){
//            System.out.println("enter no of geust entering ");
//            enter[i]=new Scanner(System.in).nextInt();
//            System.out.println("enter no of geust leaving the party ");
//            leave[i]=new Scanner(System.in).nextInt();
//        }
        System.out.println("total geust present in the paty "+totalGeust(enter, leave));
            
    }
}
