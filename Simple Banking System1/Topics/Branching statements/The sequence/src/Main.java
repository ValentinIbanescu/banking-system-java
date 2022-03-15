import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int limit = 0;
        boolean cond = true;

        for (int i =  1; i <= number && cond; i++) {

            int counter = 0;

            while (counter < i) {
                System.out.print(i + " ");
                limit++;
                counter++;

                if (limit == number) {
                    cond = false;
                    break;
                }
            }
        }
    }
}