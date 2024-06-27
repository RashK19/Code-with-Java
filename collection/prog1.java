import java.util.*;
public class prog1 {
    public static void main(String[] args) {
        List <String> l1= new ArrayList();
        l1.add("hello");
        l1.add("hii");
        l1.add("bye");
        // System.out.println(l1);
        // l1.remove(1);
        // System.out.println(l1);
        // l1.add(1,"rash");
        // System.out.println(l1);
        // l1.set(2,"ro");
        // System.out.println(l1);
        // System.out.println(l1.get(2));
        // System.out.println(l1.size());
        // l1.clear();
        // System.out.println(l1);

        //using of simple for loop
        // for (int i=0;i<l1.size();i++)
        // {
        //     System.out.println(l1.get(i));
        // }

        // using for each loop
        for(String val: l1)
        {
            System.out.println(val);
        }
    }
}
