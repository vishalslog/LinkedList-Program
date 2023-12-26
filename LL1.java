//Write a Java program to append the specified element to the end of a linked list.

import java.util.LinkedList;

public class LL1 {
    public static void main(String[] args) {
        LinkedList<Integer>a=new LinkedList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        System.out.println("before append:---"+a);
        a.addLast(7);
        System.out.println("after append:---"+a);
        


    }

    
}