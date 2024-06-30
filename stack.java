import java.util.*;
class stack {
    public static void main(String [] args)
    {
        Stack <String> s1= new Stack();
        s1.push("rash");
        s1.push("maan");
        s1.push("shan");
        s1.push("hash");
        System.out.println(s1);
        s1.pop();
        System.out.println(s1);
        for(String s: s1)
        {
            System.out.println(s);
        }
    }
}
