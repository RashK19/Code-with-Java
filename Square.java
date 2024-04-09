import java.util.Scanner;
class Square {
    public static void main(String [] args)
    {
        float side,area;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter side of square= ");
        side=sc.nextFloat();
        area=side*side;
        System.out.println("Area of square= "+area);
    }
}
