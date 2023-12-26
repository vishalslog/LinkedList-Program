// Write a Java program to iterate a linked list in reverse order.

import java.util.Iterator;
import java.util.LinkedList;

public class LL4 {
    public static void main(String[] args) {
        LinkedList<Integer>d=new LinkedList<>();
        d.add(1);
        d.add(2);
        d.add(3);
        d.add(4);
        d.add(5);
        System.out.println("before reverse iterating:----"+d);
        System.out.println("afetr reverse iterating:----");
        Iterator<Integer>itr=d.descendingIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
