

package com.mycompany.pw_skills_dsa.CollectionFromwork;

import java.util.ArrayList;
public class ArrList_Assi {
    static void reverse(ArrayList<Integer> al ){
        for(int i=0,j=al.size()-1;i<j;i++,j--){
            Integer t = al.get(i);
            al.set(i, al.get(j));
            al.set(j, t);
            
        }
        System.out.println(al);
    }
    
    public static void main(String args[]) {
       
        
       
        ArrayList<Integer> al= new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        System.out.println(al);
        al.add(0, 0);
        al.add(4,12);
        System.out.println(al);
        reverse(al);
         Integer t = al.get(2);
            al.set(2, al.get(4));
            al.set(4, t);
            System.out.println(al);
        
    }
}
