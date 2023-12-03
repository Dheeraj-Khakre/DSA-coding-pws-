/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.pw_skills_dsa.CollectionFromwork;

import java.util.*;

public class ArrayDqueueDemo {

    public static void main(String args[]) {
      //  PriorityQueue al = new PriorityQueue();
      ArrayDeque al = new ArrayDeque();
//        al.add("dk ");
//        al.add("mid");
//        al.add("night");
//        al.add("sky");
        al.add(45);
        al.add(20);

        al.add(10);
        al.add(12);
        al.add(120);
        al.add(45);
        al.add(20);

        al.add(10);
        al.add(12);
        al.add(120);
        System.out.println(al.pop());
        System.out.println(al);

    }
}
