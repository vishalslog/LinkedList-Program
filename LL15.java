// Write a Java program that swaps two elements in a linked list.
import java.util.Collections;
import java.util.LinkedList;

public class LL15 {
    public static void main(String[] args) {
         LinkedList<Integer>o=new LinkedList<>();
        o.add(1);
        o.add(2);
        o.add(3);
        o.add(4);
        o.add(5);
        o.add(6);
        System.out.println("before  swaps two elements:------"+o);
        Collections.swap(o, 0, 3);
        System.out.println("after swap the valie of index 1 and 3:------"+o);
    }
}
