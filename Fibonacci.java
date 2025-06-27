import java.util.Scanner;

public class Fibonacci {

    public static void generateFibonacci(int limit) {
        int a = 0, b = 1;

        System.out.println("Fibonacci sequence up to " + limit + ":");
        while (a <= limit) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the upper limit for the Fibonacci sequence: ");
        int limit = scanner.nextInt();

        generateFibonacci(limit);

        scanner.close();
    }
}