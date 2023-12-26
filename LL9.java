// Write a Java program to insert some elements at the specified position into a linked list.

import java.util.LinkedList;

public class LL9 {
    public static void main(String[] args) {
        LinkedList<Integer>i=new LinkedList<>();
        i.add(1);
        i.add(2);
        i.add(3);
        i.add(4);
        i.add(5);
        System.out.println("before inserting in specified position:-------"+i);
        System.out.println("after inserting in specified position:-------");
        i.add(0, 0);
        i.add(1, 1);
        System.out.println(i);
        
    }
}
