import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        final int max = 1000;
        int output = 0;

        while (sum < max) {
            int number = scanner.nextInt();

            if (number != 0) {
                sum += number;
                output = sum - max;
            } else {
                output = sum;
                break;
            }
        }

        System.out.print(output);
    }
}