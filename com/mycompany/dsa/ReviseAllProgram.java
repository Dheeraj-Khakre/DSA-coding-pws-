package com.mycompany.dsa;

////class Dk {
////    
//// private int dk = 10;
////int y;
////    void seter(int x) {
////        dk = x;
////    }
////
////    void show() {
////        System.out.println(" " + dk);
////
////    }
////  
////    Dk(int temp){
////        dk=temp;
////                System.out.println(" constructor called 1");
////
////    }
////    Dk(int x,int y){
////        this(x);
////        System.out.println(" constructor called 2");
////        this.y=y;
////    }
////}
// class Dog{
//    void eating(){
//        System.out.println("1 dog is eating food");
//    }
//}
//class DogRun extends Dog{
//   @Override
//   void eating(){
//        System.out.println("2");
//    }
//    
//}
//class DogRun2 extends Dog{
//    void eating(){
//        System.out.println("3");
//    }
//   
//    
//}
//    int x;
//    static {
//        System.out.println("this is static block");
//        
//    }
//        String str = "dk mid night sky ";
//        String str2 = "";
//        str2 = str.substring(0, 3) + str.substring(7);
//        System.out.println(str2);
//        String arr[] = str.split(" ");
//        for (String a : arr) {
//            System.out.println(a);
//           
//            
//        }
//         char ch[] = str.toCharArray();
//        for (char aa : ch) {
//                System.out.print(" " + aa);
//            }
//        StringBuilder sb =new StringBuilder("dk mid night sky ");
//    //    System.out.println(" "+sb.reverse());
//        
//        System.out.println(" "+sb.delete(0, 2));
//        System.out.println(" "+sb.insert(0, "dk"));
public class ReviseAllProgram {
//    public static float AverageArr(int arr[],int i){
//        //base case 
//        if(i==arr.length-1){
//            return arr[i];
//        }
//        
//        return (arr[i]+AverageArr(arr, i+1));

//    }
//    public static long binerytoDecimal(long n){
//        long dec =0,pow=0;
//        while(n>0){
//            long ld=n%10;
//            dec= dec+ld*(long)Math.pow(2, pow);
//            n/=10;
//            pow++;
//            
//        }
//        return dec;
//    }
//    public static int decToBinery(int n){
//        int bin=0, i=0;
//        while(n>0){
//            int ld=n%2;
//            bin = bin +  ld*(int) Math.pow(10, i);
//            i++;
//            n= n/2;
//        }
//       // System.out.println(" "+bin);
//        return bin;
//    }
    public static int binarytodecimal(int n, int i) {
        int ld = n % 10;
        if (n == 0) {
            return 0;
        } else {
            return (ld * (int) Math.pow(2, i)) + binarytodecimal(n / 10, i);
        }

    }

    public static long convertDecimalToBinary(int decimalNumber) {
        if (decimalNumber == 0) {
            return 0;
        } else {
            return (decimalNumber % 2) + 10 * convertDecimalToBinary(decimalNumber / 2);
        }
    }

    public static int convertBinaryToDecimal(int binaryNumber) {
        if (binaryNumber == 0) {
            return 0;
        } else {
            return (binaryNumber % 10) + 2 * convertBinaryToDecimal(binaryNumber / 10);
        }
    }
//      //  System.out.println(" Average of array "+AverageArr(new int[]{1,2,3,4,5,6,7,8,9,10}, 0)/9  );
////      System.out.println(" "+ decToBinery(5747772));
////      System.out.println(" "+binerytoDecimal(101));
//System.out.println(binarytodecimal(101,0));
//System.out.println(""+convertDecimalToBinary(5));
//System.out.println(""+convertBinaryToDecimal(1000));
     public static void main(String args[]) {
//        System.out.println(" " + largeElement(new int[]{1, 4, 7, 3, 8, 3, 9}, 0));
//        System.out.println(" " + smallElement(new int[]{1, 4, 7, 3, 8, 3, 9}, 0));
//        System.out.println("" + stringE(new String[]{"dd", "dd", "aa0"}, "aa0", 0));
//        System.out.println(" " + binarysearcching(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 40));
//       // System.out.println(" " + binarysearcching(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 40));
//        
       
       System.out.println(" " + binarysearcching(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 5,0,8));
       pairArr(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
       subArr(new int[]{8,1, 2, 3, 4, 5, 6, 7, 8, 9});
    }
     public static void subArr(int arr[]){
         for(int i=0;i<arr.length;i++){
             for(int j=i+1;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(" "+arr[k]);
                }
                System.out.println();
             }
             System.out.println();
         }
     }
     

    public static void pairArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print(arr[i]+" ,"+arr[j]);
            }
            System.out.println();
        }
    }

    public static int binarysearcching(int arr[], int key, int si, int ei) {
        if (si >= ei) {
            return -1;
        }
        int mid =(si+ei)/2;
        if(arr[mid]==key){
            return mid;
        }else if(arr[mid]<key){
           return binarysearcching(arr, key, mid+1, ei);
        }else
         return binarysearcching(arr, key, si, mid-1);
       
      
    }

    public static int binarysearcching(int arr[], int key) {
        int si = 0, ei = arr.length - 1;

        while (si <= ei) {
            int mid = (si + ei) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                si = mid + 1;
            } else {
                ei = mid - 1;
            }
        }
        return -1;
    }

    public static int largeElement(int arr[], int i) {
        if (i == arr.length - 1) {
            return arr[i];
        }
        return Math.max(arr[i], largeElement(arr, i + 1));
    }

    public static int smallElement(int arr[], int i) {
        if (i == arr.length - 1) {
            return arr[i];
        }
        return Math.min(arr[i], largeElement(arr, i + 1));
    }

    public static int stringE(String str[], String key, int i) {
        if (i == str.length) {
            return -1;
        }
        if (str[i].compareToIgnoreCase(key) == 0) {
            return i;
        }
        return stringE(str, key, i + 1);

    }

    public static int Arr(int x[], int key, int i) {

        if (x[i] == key) {
            return i;
        }
        if (i == x.length - 1) {
            return -1;
        }
        return Arr(x, key, i + 1);
    }

   }
