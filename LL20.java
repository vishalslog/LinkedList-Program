// Write a Java program to retrieve, but not remove, the first element of a linked list.

import java.util.LinkedList;

public class LL20 {
    public static void main(String[] args) {
        LinkedList<Integer>t=new LinkedList<>();
        t.add(1);
        t.add(2);
        t.add(3);
        t.add(4);
        t.add(5);
        t.add(6);
        System.out.println("before retrieve, but not remove, the first element:----"+t);
        System.out.println("retrive the first element:--"+t.peekFirst());
        System.out.println("remaining element is:---"+t);
    }
}
