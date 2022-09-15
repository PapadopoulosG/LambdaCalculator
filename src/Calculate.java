import java.util.Scanner;
public class Calculate {
    public static void main(String[] args) {


        Calculator calculator = new Calculator();
        calculator.registerOperation("+", (a, b) -> a + b);
        calculator.registerOperation("-", (a, b) -> a - b);
        calculator.registerOperation("/", (a, b) -> a / b);
        calculator.registerOperation("*", (a, b) -> a * b);

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPlease enter first operand: ");
        int a = scanner.nextInt();
        System.out.println("Please enter operator symbol: (+ - * or /)");
        String operator = scanner.next();
        System.out.println("Please enter second operand: ");
        int b = scanner.nextInt();
        scanner.close();
        System.out.println("Result is: ");

        System.out.println(calculator.calculate(a, operator, b));
    }
}
