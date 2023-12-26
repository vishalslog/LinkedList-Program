// Write a Java program to insert the specified element at the end of a linked list.

import java.util.LinkedList;

public class LL8 {
    public static void main(String[] args) {
        LinkedList<Integer>h=new LinkedList<>();
        h.add(1);
        h.add(2);
        h.add(3);
        h.add(4);
        h.add(5);
        System.out.println("before inserting the element in end of list are:----"+h);
        System.out.println("after   inserting the elemnt in end of list are:---- ");
        h.offerLast(6);
        System.out.println(h);
    }
}
