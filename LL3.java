//Write a Java program to iterate through all elements in a linked list starting at the specified position.

import java.util.Iterator;
import java.util.LinkedList;



public class LL3 {
    public static void main(String[] args) {
        LinkedList<Integer>c=new LinkedList<>();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        c.add(5);
        System.out.println("before iterating:------"+c);
        System.out.println("after itrating:----");
        Iterator<Integer>itr=c.listIterator(1);
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
