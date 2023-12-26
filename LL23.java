//  Write a Java program to convert a linked list to an array list
import java.util.LinkedList;
import java.util.*;

public class LL23 {
    public static void main(String[] args) {
        LinkedList<Integer>w=new LinkedList<>();
        w.add(1);
        w.add(2);
        w.add(3);
        w.add(4);
        w.add(5);
        w.add(6);
        System.out.println("LinkedList is:----"+w);
        System.out.println("now we convert LinkedList to Array:--");
        w.toArray();
        Iterator <Integer>itr=w.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
       
    }
}
