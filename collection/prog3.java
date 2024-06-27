import java.util.*;
public class prog3 {
    public static void main(String[] args) {
        List <String> l1= new LinkedList();
        l1.add("anshu");
        l1.add("rashmi");
        l1.add("huma");
        l1.add("roma");
        System.out.println(l1);
        l1.add(2,"manan");
        System.out.println(l1);
        List <String> l2= new LinkedList();
        l2.add("hello");
        l2.add("hii");
        System.out.println(l2);
        l1.addAll(l2);
        System.out.println(l1);

        List <String> l3= new LinkedList();
        l3.add("a");
        l3.add("b");

        l1.addAll(2,l3);
        System.out.println(l1);
        

        //use of iterator
        // Iterator <String> i= l1.iterator();
        // while(i.hasNext())
        // {
        //     System.out.println(i.next());
        // }

        // use of for each loop
        // for( String i:l1)
        // {
        //     System.out.println(i);
        // }

        //use of for loop
        // for(int i=0;i<l1.size();i++)
        // {
        //     System.out.println(l1.get(i));
        // }
    }
}
