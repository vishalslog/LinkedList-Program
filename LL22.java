// 
import java.util.LinkedList;

public class LL22 {
    public static void main(String[] args) {
        LinkedList<Integer>v=new LinkedList<>();
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);
        v.add(6);
        System.out.println("linkedList is:-----"+v);
        System.out.println("we check 4is exist or not:---");
         if(v.contains(0)){
            System.out.println("say yes it exists:--");
         }
         else{
            System.out.println("say no it does not exists:--");
         }
    }
}
