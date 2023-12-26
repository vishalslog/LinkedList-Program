// Write a Java program to check if a linked list is empty or not.
import java.util.LinkedList;

public class LL25 {
    public static void main(String[] args) {
        LinkedList<Integer>y=new LinkedList<>();
        y.add(1);
        y.add(2);
        y.add(3);
        y.add(4);
        y.add(5);
        y.add(6);
        System.out.println("before checking :----"+y);
        System.out.println("now we check it empty or not:---");
        y.clear();
       if(y.isEmpty()){
        System.out.println("say yes it is empty:----");

        }
        else{
            System.out.println("say no it is not empty:---");
        }
        
    
    }
}
