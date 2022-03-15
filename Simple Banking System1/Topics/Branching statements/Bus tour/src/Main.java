import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int busHeight = scanner.nextInt();
        int bridges = scanner.nextInt();
        String output = "Will not crash";

        for (int i = 1; i <= bridges; i++) {

            int bridgeHeight = scanner.nextInt();

            if (busHeight >= bridgeHeight) {
                output = String.format("Will crash on bridge %d", i);
                break;
            }
        }
        System.out.print(output);
    }
}