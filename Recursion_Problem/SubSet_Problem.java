
package Recursion_Problem;

import java.util.ArrayList;
import java.util.Collections;

public class SubSet_Problem {
    static ArrayList<Integer> al= new ArrayList<>();
    static void subSetStr(String str, String ans, int i){
    if(i==str.length()){
        System.out.println(ans);
        return;
    }
        subSetStr(str, ans+str.charAt(i), i+1);
        subSetStr(str, ans, i+1);
}
    static void subSetSum(int arr[], int ans, int i){
    if(i==arr.length){
      //  System.out.println(ans);
      al.add(ans);
        return;
    }
        subSetSum(arr, ans+arr[i], i+1);
        subSetSum(arr, ans, i+1);
}

    public static void main(String args[]) {
        subSetStr("abc", "", 0);
        subSetSum(new int[]{2,4,5}, 0, 0);
        Collections.sort(al);
        System.out.println(al);
        
    }
}
