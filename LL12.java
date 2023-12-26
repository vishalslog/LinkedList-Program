// Write a Java program to remove a specified element from a linked list.

import java.util.LinkedList;

public class LL12 {
    public static void main(String[] args) {
        LinkedList<Integer>l=new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        System.out.println("before remove a specified element:-----"+l);
        System.out.println("after remove a specified element:------");
        l.remove(0);
        System.out.println(l);
        
    }
}
