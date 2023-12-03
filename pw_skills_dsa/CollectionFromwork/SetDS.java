package com.mycompany.pw_skills_dsa.CollectionFromwork;

import java.util.*;

public class SetDS {
    
    public static void main(String args[]) {
        //  HashSet al=new HashSet();
        LinkedHashSet al = new LinkedHashSet();
        al.add(120);
        al.add("dk ");
        al.add("mid");
        al.add("night");
        al.add("sky");
        al.add(10);
        al.add(12);
        al.add(120);
        System.out.println(al);
     

        //  TreeSet ts= new TreeSet();
        //  ArrayList ts=new ArrayList();
        
        
        for (Object a : al) {
            
            System.out.print(a + " ");
        }
        System.out.println("");
        Iterator i = al.iterator();
        while (i.hasNext()) {
            System.out.print(i.next());
        }        
    }
}
