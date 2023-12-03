package com.mycompany.pw_skills_dsa.CollectionFromwork;

import java.util.*;

public class MapDemo {

    public static void main(String args[]) {
        HashMap<Integer, String> al = new HashMap<>();
        //  LinkedHashMap<Integer,String> al= new LinkedHashMap<>();
        // IdentityHashMap<Integer,String> al= new IdentityHashMap<>();

        //   TreeMap<Integer,String> al= new TreeMap<>();
        // Hashtable<Integer,String> al= new Hashtable<>();
        al.put(1, "dk");
        al.put(43, "mid");
        al.put(3, "night");

        al.put(4, "dk");
        al.put(5, "sky");
        al.put(6, "pk");
        al.put(6, "dk mid ngiht");
        al.put(45, "dk");
        System.out.println(al);
        System.out.println(al.size());
        System.out.println(al.get(1).hashCode());
        for (Map.Entry<Integer, String> m : al.entrySet()) {
            System.out.print(m + " ");

        }
        // System.out.println( al.keySet());;

        for (int a : al.keySet()) {
            System.out.println(a + " ");
        }

        for (String a : al.values()) {
            System.out.println(a + " ");
        }
        System.out.println(al.get(0));

    }
}
