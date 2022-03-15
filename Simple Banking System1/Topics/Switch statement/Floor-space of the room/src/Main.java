import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String shape = scanner.next();

        double a = scanner.nextDouble();
        double b = scanner.hasNext() ? scanner.nextDouble() : 1;
        double c = scanner.hasNext() ? scanner.nextDouble() : 1;
        double s = (a + b + c) / 2; // semi-perimeter of the triangle
        double ariaTriangle = Math.sqrt(s * (s - a) * (s - b) * (s - c)); // Heron's formula
        final double pi = 3.14;

        switch (shape) {
            case "triangle":
                System.out.print(ariaTriangle);
                break;
            case "rectangle":
                System.out.print(a * b);
                break;
            case "circle":
                System.out.print(pi * Math.pow(a, 2));
                break;
            default:
                break;
        }
    }
}