/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.pw_skills_dsa.CollectionFromwork;

import java.net.Socket;
import java.util.Iterator;
import java.util.LinkedList;


public class LinkedListDemo {

    
    public static void main(String args[]) {
        LinkedList al= new LinkedList();
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
        
        System.out.println(al.contains(120));
       // System.out.println(al.peek());
        System.out.println(al.pop());
        System.out.println(al);
    }
    
   
    
    
        
    
}
