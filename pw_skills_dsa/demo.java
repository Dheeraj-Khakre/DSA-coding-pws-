package com.mycompany.pw_skills_dsa;

class Animal {

    public void action() {
        System.out.println("animal runing ....");
    }
}

class Dog extends Animal {
    //  static demo d = new demo();

    @Override
    public void action() {
        System.out.println("dog runing ....");
        // d.main(null);
    }
}

public class demo {

    public static int secSmallest(int arr[]) {
        int s = Integer.MAX_VALUE;
        int SecondSm = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] < s) {
                SecondSm = s;
                s = arr[i];
            } else if (arr[i] < SecondSm) {
                SecondSm = arr[i];
            }

        }
        System.out.println("second smallest" + SecondSm);
        return SecondSm;
    }

    public static void main(String args[]) {
        //  Animal.action();
        Animal a1= new Dog();
            a1.action();
        // a1.main(null);
        // Dog.action();
        Dog a = new Dog();
        a.action();
        // demo d = new demo();
        // demo.secSmallest(new int[]{5, 4, 2, -1, 6});

        //  System.out.println("second smallest element in arr :" + secSmallest(new int[]{5, 4, 2,-1, 6}));
    }
}
