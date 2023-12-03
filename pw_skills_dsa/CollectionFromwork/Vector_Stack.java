/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.pw_skills_dsa.CollectionFromwork;

import java.util.*;



public class Vector_Stack {

    
    public static void main(String args[]) {
        Vector al=new Vector();
    //Stack al=new Stack();
        // al.add(120);
        al.add(20);
        al.add("dk ");
        al.add("mid");
        al.add("night");
        al.add("sky");
        al.add(10);
        al.add(12);
        al.add(120);
        System.out.println(al);
        for(Object a:al){
            System.out.print(a+" ");
        }
        System.out.println("");
        int i=0;
        while(!al.isEmpty()){
            System.out.print(al.get(i)+" ");
            i++;
        }
        
    }
}
