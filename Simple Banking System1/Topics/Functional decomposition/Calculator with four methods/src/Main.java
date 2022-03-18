// Solution with Regex that works also for sample Input wo spaces, example 739+177.
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class SimpleCalculator {
    public static void subtractTwoNumbers(long a, long b) {
        long result = a - b;
        System.out.print(result);
    }

    public static void sumTwoNumbers(long a, long b) {
        long result = a + b;
        System.out.print(result);
    }

    public static void divideTwoNumbers(long a, long b) {
        if (b != 0) {
            System.out.print(a / b);
        } else {
            System.out.print("Division by 0!");
        }
    }

    public static void multiplyTwoNumbers(long a, long b) {
        long result = a * b;
        System.out.print(result);
    }

    public static void main(String[] args) {
        System.out.print("Enter the operation to calculate. Example: 739 + 177 or 739+177\n>");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Pattern patternFirstNumber = Pattern.compile("^\\d*");
        Pattern patternSecondNumber = Pattern.compile("\\d*$");
        Pattern operationSymbol = Pattern.compile("[\\/\\+\\-\\*]");

        Matcher matcher1 = patternFirstNumber.matcher(input);
        Matcher matcher2 = patternSecondNumber.matcher(input);
        Matcher matcher3 = operationSymbol.matcher(input);

        if (!matcher1.find() || !matcher2.find() || !matcher3.find()) {
            System.out.print("Incorrect input. Try again!");
        }

        long a = Long.parseLong(matcher1.group());
        long b = Long.parseLong(matcher2.group());
        char symbol = matcher3.group().charAt(0);

        switch (symbol) {
            case '*':
                multiplyTwoNumbers(a, b);
                break;
            case '/':
                divideTwoNumbers(a, b);
                break;
            case '-':
                subtractTwoNumbers(a, b);
                break;
            case '+':
                sumTwoNumbers(a, b);
                break;
            default:
                System.out.println("Error incorrect input");
                break;
        }
    }
}