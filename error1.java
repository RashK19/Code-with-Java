public class error1 {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int division = 10 /0; // This will throw an ArithmeticException
            System.out.println("Result: " + division);
        } catch (ArithmeticException e) {
            // This block will handle the ArithmeticException
            System.out.println("ArithmeticException caught: Division by zero is not allowed.");
        } 
        
        System.out.println("Program continues after the try-catch block.");
    }
}

