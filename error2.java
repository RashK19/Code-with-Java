public class error2 {
    public static void main(String[] args) {
        try {
            // Code that may throw multiple exceptions
            //int[] numbers = {1, 2, 3};
            //int result = numbers[5]; // This will throw ArrayIndexOutOfBoundsException
            int division = 10 / 0; // This will throw ArithmeticException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } //catch(SQLException e) {
        //     System.out.println("Database error: " + e.getMessage());
        // }
    }
}

