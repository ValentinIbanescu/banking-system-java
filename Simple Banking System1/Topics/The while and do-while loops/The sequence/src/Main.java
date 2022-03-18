import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        scanner.skip(".");
        int max = 0;
        final int divisor = 4;

        while (scanner.hasNext()) {
            int input = scanner.nextInt();
            max = input > max && input % divisor == 0 ? input : max;
        }
        System.out.print(max);
    }
}