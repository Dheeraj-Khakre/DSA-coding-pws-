//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
package Array_DSA;

public class Contain_Duplicat {
      public static boolean containDuplicate(int arr[]){
          for (int i = 0; i < arr.length; i++) {
              for (int j = 0; j < arr.length; j++) {
                  if(i==j){
                      continue;
                  }else if(arr[i]==arr[j]){
                     return true ;
                  }
                  
              }
              
          }
          return false;
      }
    
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        System.out.println(    containDuplicate(arr));
    }

}
