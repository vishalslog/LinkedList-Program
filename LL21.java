// Write a Java program to retrieve, but not remove, the last element of a linked list.

import java.util.LinkedList;

public class LL21 {
    public static void main(String[] args) {
        LinkedList<Integer>u=new LinkedList<>();
        u.add(1);
        u.add(2);
        u.add(3);
        u.add(4);
        u.add(5);
        u.add(6);
        System.out.println("before retrieve, but not remove, the last element:----"+u);
        System.out.println("retrive the last element:--"+u.peekLast());
        System.out.println("remaining element is:---"+u);
    }
}
