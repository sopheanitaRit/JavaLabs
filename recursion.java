import java.util.Scanner;

public class recursion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        double result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);

        scanner.close();
    }

    public static double factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

}