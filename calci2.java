import java.util.Scanner;
class calci2
{
    public static void main(String [] args)
    {
        int a,b,sum,sub,mul,div;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter first number= ");
        a=sc.nextInt();
        System.out.println("enter second number= ");
        b=sc.nextInt();
        sum=a+b;
        sub=a-b;
        mul=a*b;
        div=a/b;
        System.out.println("Sum="+sum);
        System.out.println("Sub="+sub);
        System.out.println("Mul="+mul);
        System.out.println("Div="+div);
    }
}

