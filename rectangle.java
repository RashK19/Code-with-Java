import java.util.*;
class rectangle {
    public static void main(String [] args)
    {
        float l,b,area;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter length of rectangle= ");
        l=sc.nextFloat();
        System.out.println("enter breadth of rectangle= ");
        b=sc.nextFloat();
        area=l*b;
        System.out.println("Area of rectangle= "+area);
    }
}
