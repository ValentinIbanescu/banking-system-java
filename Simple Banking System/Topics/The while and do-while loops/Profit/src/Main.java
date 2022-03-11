import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double m = scanner.nextInt();
        double p = scanner.nextInt();
        double k = scanner.nextInt();
        final int percent = 100;
        int years = 0;
        while (m < k) {
            m *= 1 + p / percent;
            years++;
        }
        System.out.println(years);
    }
}