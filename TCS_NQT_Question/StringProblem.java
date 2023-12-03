/*
 * Problem Statement – Given a string S(input consisting) of ‘*’ and ‘#’. The length of the string is variable. The task is to find the minimum number of ‘*’ or ‘#’ to make it a valid string. The string is considered valid if the number of ‘*’ and ‘#’ are equal. The ‘*’ and ‘#’ can be at any position in the string.
Note : The output will be a positive or negative integer based on number of ‘*’ and ‘#’ in the input string.

(*>#): positive integer
(#>*): negative integer
(#=*): 0
Example 1:
Input 1:

###***   -> Value of S
Output :

0   → number of * and # are equal
 */
package TCS_NQT_Question;


public class StringProblem {

    public static int stringelementChack(String str){
        int s=0,h=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='#'){
                h++;
            }else{
                s++;
            }
        }
        return s-h;
    }
    public static void main(String args[]) {
        // TODO code application logic here
        String str="#*#*#*#*#**";
        System.out.println(stringelementChack(str));
    }
}
