import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int shape = scanner.nextInt();
        final int caseThree = 3;
        final int caseFour = 4;
        switch (shape) {
            case 1:
                System.out.print("You have chosen a square");
                break;
            case 2:
                System.out.print("You have chosen a circle");
                break;
            case caseThree:
                System.out.print("You have chosen a triangle");
                break;
            case caseFour:
                System.out.print("You have chosen a rhombus");
                break;
            default:
                System.out.print("There is no such shape!");
                break;
        }
    }
}