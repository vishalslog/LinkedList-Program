// Write a Java program to insert the specified element at the front of a linked list.

import java.util.LinkedList;

public class AA7 {
    public static void main(String[] args) {
        LinkedList<Integer>g=new LinkedList<>();
        g.add(1);
        g.add(2);
        g.add(3);
        g.add(4);
        g.add(5);
        System.out.println("before inserting the specified element:------"+g);
        System.out.println("afater inserting the specified element:---- ");
        g.offerFirst(0);
        System.out.println(g);
        
    }
}
