
package Array_DSA;


public class QuickSort {
    
    
    public static void quickSort(int arr[],int si,int ei){
            if(si>=ei){
        return;
    }
       
       int pivot = pertition(arr,si,ei);
        quickSort(arr, si, pivot-1);
        quickSort(arr, pivot+1, ei);
   
    }
    public static int pertition(int arr[],int si,int ei){
        int pivot=arr[ei ];
        int i=si-1;
        for(int j=si;j<ei;j++){
           if(arr[j]<=pivot){
                i++;
            int temp =arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
           }
                    
        }
        i++;
        
        arr[ei]=arr[i];
        arr[i]=pivot;
        return i;
        
        
        
    }
 public static void printarray(int arr[]){
        for(int aa:arr){
            System.out.print(" "+aa);
        }
    }
    public static void main(String args[]) {
        // TODO code application logic here
        int arr[] = {6, 3, 9, 2, 5, 8,-2,4};
        quickSort(arr, 0, arr.length-1);
        printarray(arr);
    }
}
