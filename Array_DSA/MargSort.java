package Array_DSA;

public class MargSort {

    public static void margSort(int arr[], int si, int ei) {

        if (si >= ei) {
            return;
        }
        ///kaam 
        int mid = (si + ei) / 2;
        margSort(arr, si, mid);//left side
        margSort(arr, mid + 1, ei);//right array
        marg(arr, si, mid, ei);// marging 

    }

    public static void marg(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;//left sorting array 
        int j = mid + 1;//right sorting array 
        int k = 0;
        //sorting element 
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
       
        //left remening ellment 
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }
      //  System.arraycopy(temp, 0, arr, 0, temp.length);
    for(k=0,i=si;k<temp.length;k++,i++)
    {
        arr[i]=temp[k];
    }
    }
    public static void printarray(int arr[]){
        for(int aa:arr){
            System.out.print(" "+aa);
        }
    }
   public static void main(String agr[]){
        // TODO code application logic here
        int arr[] = {6, 3, 9, 2, 5, 8,-2,4};
        margSort(arr, 0, arr.length-1);
        printarray(arr);

    }
}
