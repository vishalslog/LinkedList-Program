// Write a Java program to copy a linked list to another linked list.

import java.util.LinkedList;

public class LL18 {
    public static void main(String[] args) {
    LinkedList<Integer>r=new LinkedList<>();
        r.add(1);
        r.add(2);
        r.add(3);
        r.add(4);
        r.add(5);
        r.add(6);
        System.out.println("Origional LinkedList are:-------"+r);
        System.out.println("copy LinkedList are:---");
         LinkedList<Integer>rc=new LinkedList<>();
        rc=(LinkedList<Integer>) r.clone();
        System.out.println(rc);
    }
}
