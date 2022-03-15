import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int largestNumber = scanner.nextInt();

        while (scanner.hasNext()) {
            int nextNumber = scanner.nextInt();

            if (nextNumber > largestNumber) {
                largestNumber = nextNumber;
            }

            if (nextNumber == 0) {
                break;
            }

        }
        System.out.print(largestNumber);
    }
}