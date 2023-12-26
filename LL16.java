//Write a Java program to shuffle elements in a linked list.
import java.util.Collections;
import java.util.LinkedList;

public class LL16 {
   
    public static void main(String[] args) {
        LinkedList<Integer>p=new LinkedList<>();
        p.add(1);
        p.add(2);
        p.add(3);
        p.add(4);
        p.add(5);
        p.add(6);
        System.out.println("before shuffle element:------"+p);
        Collections.shuffle(p);
        System.out.println("after shuffle element:---"+p);

    }
    
}
