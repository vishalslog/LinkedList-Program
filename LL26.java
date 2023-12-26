//  Write a Java program to replace an element in a linked list.
import java.util.LinkedList;

public class LL26 {
    public static void main(String[] args) {
        LinkedList<Integer>z=new LinkedList<>();
        z.add(1);
        z.add(2);
        z.add(3);
        z.add(4);
        z.add(5);
        z.add(6);
        System.out.println("before replacing all element are:-----"+z);
        System.out.println("now we replace the 2 to 8:-------");
        z.set(1, 8);
        System.out.println(z);
    }
}
