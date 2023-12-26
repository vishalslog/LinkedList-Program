//  Write a Java program to insert elements into the linked list at the first and last positions.

import java.util.LinkedList;

public class LL6 {
    public static void main(String[] args) {
        LinkedList<Integer>f=new LinkedList<>();
        f.add(1);
        f.add(2);
        f.add(3);
        f.add(4);
        f.add(5);
        System.out.println("before adding the elemnt in the first and last position are : ----"+f);
        System.out.println("after adding te elemnt in first and last position are:----");
        f.addFirst(0);
        f.addLast(6);
        System.out.println(f);
        
    }
}
