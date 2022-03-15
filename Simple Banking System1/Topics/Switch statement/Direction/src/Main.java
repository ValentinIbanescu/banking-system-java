import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int move = scanner.nextInt();
        final int caseThree = 3;
        final int caseFour = 4;
        switch (move) {
            case 1:
                System.out.print("move up");
                break;
            case 2:
                System.out.print("move down");
                break;
            case caseThree:
                System.out.print("move left");
                break;
            case caseFour:
                System.out.print("move right");
                break;
            case 0:
                System.out.print("do not move");
                break;
            default:
                System.out.print("error!");
                break;
        }
    }
}