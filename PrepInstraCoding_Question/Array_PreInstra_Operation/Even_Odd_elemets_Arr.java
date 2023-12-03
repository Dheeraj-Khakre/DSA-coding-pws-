

package PrepInstraCoding_Question.Array_PreInstra_Operation;


public class Even_Odd_elemets_Arr {

    //  total even and odd no. in given array
    public static void evenOddEle(int arr[]){
        int ev=0;
        int od=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                ev++;
            }else{
                od++;
            }
        }
        System.out.println("even elements in array is "+ev);
        System.out.println("odd elements in array is "+od);
    }
    public static void main(String args[]) {
        // TODO code application logic here
        int arr[]={2,3,4,5,6,7,8,9,10,12,15};
        evenOddEle(arr);
    }
}
