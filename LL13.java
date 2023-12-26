// Write a Java program to remove the first and last elements from a linked list.

import java.util.LinkedList;

public class LL13 {
    public static void main(String[] args) {
        LinkedList<Integer>m=new LinkedList<>();
        m.add(1);
        m.add(2);
        m.add(3);
        m.add(4);
        m.add(5);
        System.out.println("before removing:---"+m);
        System.out.println("removing first element:  "+m.removeFirst());
        System.out.println("remove last element: "+m.removeLast());
        System.out.println("new list:----"+m);
    }
}
