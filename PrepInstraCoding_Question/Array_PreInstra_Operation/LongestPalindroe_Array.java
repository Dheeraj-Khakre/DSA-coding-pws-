

package PrepInstraCoding_Question.Array_PreInstra_Operation;



public class LongestPalindroe_Array {

    public static int isPalindrome(int n){
        int digit =0;
        int temp=n;
        int rev=0;
        while(temp>0){
            rev = rev*10 +temp%10;
            temp/=10;
            digit++;
        }
        
        return rev==n?digit:-1;
        
    }
    public static   int longestPalindrome(int arr[]){
        int lng=-0;
        int cur=0;
        int id=-1;
        
        for(int i=0;i<arr.length;i++){
            cur=isPalindrome(arr[i]);
            if(cur>lng && cur!=-1){
                lng= cur;
                id=i;
            }
        }
       return id==-1?-1:arr[id];
               
        
    }
    public static void main(String args[]) {
        // TODO code application logic here
        int arr[]= {121,3232,454,454545,909,12321};
        System.out.println(longestPalindrome(arr));
    }
}
