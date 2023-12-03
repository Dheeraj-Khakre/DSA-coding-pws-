/*
 
//Given a positive integer N, return the Nth row of pascal’s triangle – C | C++ | Java | Python

 */

package PrepInstraCoding_Question.recursion_pro_100;
import java.util.ArrayList;
  

public class Pascal_Triangle_nRow {

   public static ArrayList pascalTriangle(int index){
       ArrayList<Integer> cur= new ArrayList<>();
       cur.add(1);
       if(index==0){
           return cur;
       }
       ArrayList<Integer> prev=pascalTriangle(index-1);
       for(int i=1;i<prev.size();i++){
           int x=prev.get(i-1)+prev.get(i);
           cur.add(x);
       }
       cur.add(1);
       return cur;
   }
    public static void main(String args[]) {
        // TODO code application logic here
        int idx=6;
        ArrayList al= pascalTriangle(idx);
       for (Object a : al) {
           System.out.print(a+" , ");
       }
    }
}
