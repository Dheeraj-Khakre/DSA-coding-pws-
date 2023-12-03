package PrepInstraCoding_Question.Array_PreInstra_Operation;

import java.util.HashMap;
import java.util.*;

public class Frequuency_Array {

    public static void frequency(int arr[]) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            // 
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            } else {
                hm.put(arr[i], 1);

            }
        }
        System.out.println("frequancy of all duplicats ");
                System.out.println(hm);

//        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
//            System.out.println(entry);
//
//        }
        // Arrays.sort(arr);
        System.out.println("................");
        List<Map.Entry<Integer, Integer>> sort = new ArrayList<>(hm.entrySet());

        // Sort the entries based on the age of the Person using a Comparator
        Collections.sort(sort, (Map.Entry<Integer, Integer> entry1, Map.Entry<Integer, Integer> entry2) -> Integer.compare(entry2.getValue(), entry1.getValue()));
          int k =0;
       // ArrayList<Integer> list= new ArrayList<>();
        for (Map.Entry<Integer, Integer> s : sort) {
            for(int i=1;i<=s.getValue();i++){
             //   list.add(s.getKey());
                arr[k++]=s.getKey();
            }
        }
     //   System.out.println(list);

    }

    public static void main(String args[]) {
        // TODO code application logic here
        int arr[] = {1, 2, 1, 2, 3, 1, 32, 1, 2, 4, 4, 5, 5, 6};
        frequency(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

//    private static class ComparatorImpl implements Comparator<Map.Entry<Integer, Integer>> {
//
//        public ComparatorImpl() {
//        }
//
//        @Override
//        public int compare(Map.Entry<Integer, Person> entry1, Map.Entry<Integer, Person> entry2) {
//            return Integer.compare(entry1.getValue().getAge(), entry2.getValue().getAge());
//        }
//    }
}
