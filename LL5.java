// Write a Java program to insert the specified element at the specified position in the linked list

import java.util.LinkedList;

public class LL5 {
    public static void main(String[] args) {
        LinkedList<Integer>e=new LinkedList<>();
        e.add(1);
        e.add(2);
        e.add(3);
        e.add(4);
        e.add(5);
        System.out.println("before inserting :------"+e);
        System.out.println("after inserting:-------");
        e.add(3,6);
        System.out.println(e);
    }
}
