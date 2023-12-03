/*
 //Find all possible Palindromic partitions of the given String – C | C++ | Java | Python

 */
package PrepInstraCoding_Question.recursion_pro_100;




public class PalindromicPartitions {
    public static boolean ispalindrome(String str){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void partition_palindrome(String str, String ans){
        
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            String prefix= str.substring(0,i+1);
            String remane= str.substring(i+1);
            if(ispalindrome(prefix)){
                partition_palindrome(remane, ans+" "+prefix);
            }
        }
    }
    public static void main(String[] args) {
        partition_palindrome("moom", "");
    }
}
