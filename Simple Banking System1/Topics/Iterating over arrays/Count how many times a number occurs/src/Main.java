import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sizeInputArray = sc.nextInt();
        int[] inputArray = new int[sizeInputArray];

        for (int i = 0; i < sizeInputArray; i++) {
            inputArray[i] = sc.nextInt();
        }

        int number = sc.nextInt();
        int counter = 0;

        for (int elem : inputArray) {
            if (elem == number) {
                counter++;
            }
        }
        System.out.print(counter);
    }
}