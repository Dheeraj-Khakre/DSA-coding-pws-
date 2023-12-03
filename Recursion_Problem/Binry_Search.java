

package Recursion_Problem;

import java.util.ArrayList;


public class Binry_Search {

    static int binary_search(int arr[] ,int si,int ei ,int key){
        if(si>ei){
            return -1;
        }
        int mid = (si+ei)/2 ;
        if(arr[mid]==key){
            return mid;
        }else if(arr[mid]>key){
          
            ei=mid-1;
        }else{
           
            si=mid +1;
        }
        return binary_search(arr, si, ei, key);
        
        
    }
    
    
    
    
    
    
    
    
    

    //Given two sorted arrays A and B of length m and n respectively, generate all possible arrays 
//such that the first element is taken from A then from B then from A, and so on in increasing order 
//till the arrays are exhausted. The generated arrays should end with an element from B.
    static void possibleArrays(int A[],int B[]){
        ArrayList<Integer> ans = new ArrayList<>();
       
        
        
    }
    public static void main(String args[]) {
       
        int arr[ ]= {1,3,5,7,9,12,14};
        System.out.println(binary_search(arr, 0, arr.length, 7));
//        for(char ch=(char)1;ch<='z';ch++){
//            System.out.println((int)ch+" =  "+ch);
//        }
       
    }
}
