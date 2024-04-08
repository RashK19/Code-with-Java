import java.util.Scanner;
class p1
{
    public static void main(String [] args)
    {
        int a,b;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number= ");
        a= sc.nextInt();
        System.out.println("Enter second number= ");
        b= sc.nextInt();
        if(a>b)
        {
            System.out.println(a+" is greater");
        }
        else{
            System.out.println(b+" is greater");
        }
    }
}


