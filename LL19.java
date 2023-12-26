//Write a Java program to remove and return the first element of a linked list.

import java.util.LinkedList;

public class LL19 {
    public static void main(String[] args) {
        LinkedList<Integer>s=new LinkedList<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);
        s.add(6);
        System.out.println("before remove and return the first element:---- "+s);
        System.out.println("removing elemnt is:---"+s.pop());
         s.pop();
        System.out.println(" return ing element is:----"+s);
    }
}
