import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arraySize = sc.nextInt();
        int[] inputArray = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            inputArray[i] = sc.nextInt();
        }

        int min = inputArray[0];

        for (int k = 1; k < arraySize; k++) {
            if (inputArray[k] < min) {
                min = inputArray[k];
            }
        }
        System.out.println(min);
    }
}