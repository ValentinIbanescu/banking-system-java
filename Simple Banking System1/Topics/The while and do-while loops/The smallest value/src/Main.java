import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long m = scanner.nextLong();
        int i = 1;

        while (factorial(i).compareTo(BigInteger.valueOf(m)) <= 0) {
            i += 1;
        }
        System.out.print(i);
    }
    // Method for factorial with BigInteger: https://docs.oracle.com/javase/8/docs/api/java/math/BigInteger.html

    public static BigInteger factorial(int n) {
        BigInteger factorial = BigInteger.valueOf(n);

        if (n == 0) {
            factorial = BigInteger.valueOf(1);
        }

        int next = n;
        while (next - 1 > 0) {
            next--;
            factorial = factorial.multiply(BigInteger.valueOf(next));
        }

        return factorial;
    }
}