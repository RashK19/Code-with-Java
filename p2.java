
import java.util.Scanner;
class p2 
{
    public static void main(String [] args)
    {
        int a,b,c;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number= ");
        a=sc.nextInt();
        System.out.println("Enter second number= ");
        b=sc.nextInt();
        System.out.println("Enter third number= ");
        c=sc.nextInt();
        if(a>b)
        {
            if(a>c)
            {
                System.out.println(a+" is greater");
            }
            else
            {
                System.out.println(c+" is greater");
            }
        }
        else
        {
            if(b>c)
            {
                System.out.println(b+" is greater");
            }
            else
            {
                System.out.println(c+" is greater");
            }
        }
    }
}
