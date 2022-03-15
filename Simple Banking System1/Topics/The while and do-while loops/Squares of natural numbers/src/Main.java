import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        for (int i = 1; Math.pow(i, 2) <= number; i++) {
            System.out.println(Math.round(Math.pow(i, 2)));
        }
    }
}