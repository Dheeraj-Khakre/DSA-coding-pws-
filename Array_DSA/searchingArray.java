//Search in Rotated Sorted Array

package Array_DSA;

public class searchingArray {
    public static int searchingArray(int arr[] ,int key){
        for(int i=0;i<arr.length;i++)
        { if(arr[i]==key){
            return i;
        }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int x[]= {4,5,6,7,0,1,2};
        System.out.println(" "+searchingArray(x, 3));
    }
    
}
