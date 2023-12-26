//  Write a Java program to join two linked lists
import java.util.Collections;
import java.util.LinkedList;
public class LL17 {
    public static void main(String[] args) {
        LinkedList<Integer>q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        System.out.println("firstLinkedList is:-----"+q);
        LinkedList<Integer>qc=new LinkedList<>();
        qc.add(1);
        qc.add(2);
        qc.add(3);
        qc.add(4);
        qc.add(5);
        qc.add(6);
        System.out.println("second linkedlist is:----"+qc);

        System.out.println("now we join two linkedlist:-------");
        LinkedList<Integer>qcc=new LinkedList<>();
        qcc.addAll(q);
        qcc.addAll(qc);
        System.out.println("new LinkedList are:------");
        System.out.println(qcc);
        
        
    }
    
}
