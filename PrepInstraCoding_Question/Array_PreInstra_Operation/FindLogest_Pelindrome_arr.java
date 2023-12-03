/*
Finding the Longest Palindrome in an Array
 */
package PrepInstraCoding_Question.Array_PreInstra_Operation;


public class FindLogest_Pelindrome_arr {

    
    public static int isPalindrome(int n){
        int no=n;
        int count=0;
        int rev=0;
        while(n>0){
           rev = rev*10 + n%10;
           n/=10;
           count++;
        }
        if(no==rev){
            return count;
        }else
            return -1;
    }
    public static int  longestPelidrome(int arr[]){
        int max=0;
        int index=0;
        for(int i=0;i<arr.length;i++){
          
            int curmax=isPalindrome(arr[i]);
            
           if(curmax!=-1){
                if(curmax>max){
                max=curmax;
                index=i;
            }
           }
        }
        System.out.println(" index is longest palindrome = "+index +"  pelindrome is = "+arr[index]);
        return max;
    }
    public static void main(String args[]) {
   int arr[]= {1,12,10,212,34553,12321};
   System.out.println("length is = "+longestPelidrome(arr));
        
    }
}
