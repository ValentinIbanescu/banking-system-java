import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        final int case3 = 3;
        final int case4 = 4;

        switch (input) {
            case 1:
                System.out.print("Yes!");
                break;
            case 2:
            case case3:
            case case4:
                System.out.print("No!");
                break;
            default:
                System.out.print("Unknown number");
                break;
        }
    }
}