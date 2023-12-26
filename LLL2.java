// Write a Java program to iterate through all elements in a linked list.

import java.util.Iterator;
import java.util.LinkedList;

public class LLL2 {
    public static void main(String[] args) {
        LinkedList<Integer>b=new LinkedList<>();
        b.add(1);
        b.add(2);
        b.add(3);
        b.add(4);
        b.add(5);
        System.out.println("before iterating:---"+b);
         Iterator <Integer>itr=b.iterator();
        System.out.println("iterating using iterator:-----");
         while(itr.hasNext()){
            System.out.println(itr.next());
         }

         System.out.println("iterating using loop:----");
        for(int i :b){
            System.out.println(i);
        }
    }
    
}
