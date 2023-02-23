package task2;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(1);
        System.out.println(myArrayList);
        myArrayList.add(2);
        System.out.println(myArrayList);
        myArrayList.add(3);
        System.out.println(myArrayList);
        myArrayList.add(4);
        System.out.println(myArrayList);

        myArrayList.remove(2);
        System.out.println(myArrayList);
        myArrayList.remove(0);
        System.out.println(myArrayList);
        myArrayList.remove(0);
        System.out.println(myArrayList);
        myArrayList.add(0,100);
        System.out.println(myArrayList);
        myArrayList.add(1,200);
        System.out.println(myArrayList);
        myArrayList.add(2,300);
        System.out.println(myArrayList);
    }
}
