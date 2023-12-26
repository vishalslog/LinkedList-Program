// Write a Java program to get the first and last occurrence of the specified elements in a linked list.

import java.util.LinkedList;

public class LL10 {
    public static void main(String[] args) {
        LinkedList<Integer>j=new LinkedList<>();
        j.add(1);
        j.add(2);
        j.add(3);
        j.add(4);
        j.add(5);
        System.out.println(" before get the first and last occurrence of the specified:------"+j);
        System.out.println("first occurence element:-----"+j.getFirst());
        System.out.print("last occurence element:------"+j.getLast());
    }
}
