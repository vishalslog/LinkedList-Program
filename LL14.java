// Write a Java program to remove all elements from a linked list.

import java.util.LinkedList;

public class LL14 {
    public static void main(String[] args) {
         LinkedList<Integer>n=new LinkedList<>();
        n.add(1);
        n.add(2);
        n.add(3);
        n.add(4);
        n.add(5);
        n.add(6);
        System.out.println("before removing all element:-----"+n);
        n.clear();;
        System.out.println("after removing all element:-------"+n);
    }
}
