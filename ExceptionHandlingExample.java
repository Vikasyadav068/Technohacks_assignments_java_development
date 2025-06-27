import java.util.Scanner;

public class ExceptionHandlingExample {

    
    public static int divide(int numerator, int denominator) throws ArithmeticException {
        return numerator / denominator;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.print("Enter numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();

        try {
        
            
            int result = divide(numerator, denominator);
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
           
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
           
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            
            scanner.close();
            System.out.println("Program execution completed.");
        }
    }
}