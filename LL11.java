// Write a Java program to display elements and their positions in a linked list.

import java.util.LinkedList;

public class LL11 {
    public static void main(String[] args) {
        LinkedList<Integer>k=new LinkedList<>();
        k.add(1);
        k.add(2);
        k.add(3);
        k.add(4);
        k.add(5);
        System.out.println("before  display elements and their positions:-----"+k);
        for(int i=0;i<k.size();i++){
            System.out.println("element at index  "+i+" : "+k.get(i));
        }
    }
}
