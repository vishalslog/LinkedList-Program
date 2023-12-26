//  Write a Java program to convert a linked list to an array list

import java.util.LinkedList;

public class LL24 {
public static void main(String[] args) {
    LinkedList<Integer>x=new LinkedList<>();
        x.add(1);
        x.add(2);
        x.add(3);
        x.add(4);
        x.add(5);
        x.add(6);
        System.out.println("first Linkedlist is:----"+x);

        LinkedList<Integer>xc=new LinkedList<>();
        xc.add(9);
        xc.add(2);
        xc.add(3);
        xc.add(4);
        xc.add(5);
        xc.add(6);
        System.out.println("second LinkedList is:---"+xc);
        System.out.println("now we compare first and second LinkedList:----");
        if(x.containsAll(xc)){
            System.out.println("if contain say yes:---");

        }
        else{
            System.out.println("if not exist say no:-----");
        }
        

        
        
}
    
}