import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        final int divide2 = 2;
        final int multi3 = 3;
        final int result = 1;

        while (number != result) {
            System.out.print(number + " ");
            if (number % divide2 != 0) {
                number = number * multi3 + result;
            } else {
                number /= divide2;
            }
        }
        System.out.print(result);
    }
}
