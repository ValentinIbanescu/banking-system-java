import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        String operator = scanner.next();
        long b = scanner.nextLong();

        switch (operator) {
            case "+":
                System.out.print(a + b);
                break;
            case "-":
                System.out.print(a - b);
                break;
            case "/":
                if (b == 0) {
                    System.out.print("Division by 0!");
                } else {
                    System.out.print(a / b);
                }
                break;
            case "*":
                System.out.print(a * b);
                break;
            default:
                System.out.print("Unknown operator");
                break;
        }
    }
}