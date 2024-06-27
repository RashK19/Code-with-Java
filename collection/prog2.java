import java.util.*;
public class prog2 {
    public static void main(String[] args) {
        List <Integer> l1 = new ArrayList();
        l1.add(30);
        l1.add(10);
        l1.add(20);
        l1.add(50);
        System.out.println(l1);
        // for (int val:l1)
        // {
        //     System.out.println(val);
        // }

        // System.out.println(l1.contains(40));
        // System.out.println(l1.contains(20));
        // System.out.println(l1.indexOf(20));
        // System.out.println(l1.indexOf(30));

        //sorting
        // Collections.sort(l1);
        // System.out.println(l1);

        // binary search
        // System.out.println(Collections.binarySearch(l1,30));

        // fill method fills all the arraylist with the same value
        // Collections.fill(l1,90);
        // System.out.println(l1);

        //reverse the arraylist
        // Collections.reverse(l1);
        // System.out.println(l1);

        //rotate method
        Collections.rotate(l1,2);
        System.out.println(l1);
    
    }
}
