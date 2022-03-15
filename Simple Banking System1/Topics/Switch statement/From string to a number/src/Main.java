import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        final int case3 = 3;
        final int case4 = 4;
        final int case5 = 5;
        final int case6 = 6;
        final int case7 = 7;
        final int case8 = 8;
        final int case9 = 9;
        switch (number) {
            case "one" -> System.out.print(1);
            case "two" -> System.out.print(2);
            case "three" -> System.out.print(case3);
            case "four" -> System.out.print(case4);
            case "five" -> System.out.print(case5);
            case "six" -> System.out.print(case6);
            case "seven" -> System.out.print(case7);
            case "eight" -> System.out.print(case8);
            case "nine" -> System.out.print(case9);
            default -> System.out.print("");
        }
    }
}