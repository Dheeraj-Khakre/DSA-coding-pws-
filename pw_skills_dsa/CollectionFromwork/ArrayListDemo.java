package com.mycompany.pw_skills_dsa.CollectionFromwork;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

    public static void main(String args[]) {
        ArrayList al = new ArrayList();
        al.add(120);
        al.add(20);
        al.add("dk ");
        al.add("mid");
        al.add("night");
        al.add("sky");
        al.add(10);
        al.add(12);
        al.add(120);
        System.out.println(al);
        System.out.println(al.get(0));
        //    System.out.println(al.hashCode());
        System.out.println(al.getClass());
        System.out.println(al.isEmpty());
        System.out.println(al.indexOf(120));
        System.out.println(al.lastIndexOf(10));
        System.out.println(al.parallelStream());
        System.out.println(al.remove(2));
        System.out.println(al);
        Iterator itr= al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }

    }
}
