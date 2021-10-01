import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        while (scanner.hasNext()) {
            int input = scanner.nextInt();
            if (input != 0) {
                result += input;
            } else {
                break;
            }
        }
        System.out.print(result);
    }
}