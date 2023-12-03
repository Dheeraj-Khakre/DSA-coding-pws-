/*
 Airport security officials have confiscated several item of the passengers at the security check point.
All the items have been dumped into a huge box (array). Each item possesses a certain amount of risk[0,1,2].
Here, the risk severity of the items represent an array[] of N number of integer values.
The task here is to sort the items based on their levels of risk in the array.
The risk values range from 0 to 2.
 */
package TCS_NQT_Question;

public class AirPortRisk {

    public static void sorting(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }   
    }

    public static void main(String args[]) {
        // TODO code application logic here
        int arr[] = {1, 0, 2, 0, 1, 2};
        sorting(arr);
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
