import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();

        ArrayList<Integer> inputArray = new ArrayList<>();

        for (int i = 1; i <= arraySize; i++) {
            int input = sc.nextInt();
            inputArray.add(input);
        }

        int max = inputArray.get(0) * inputArray.get(1);

        for (int k = 1; k < arraySize - 1; k++) {
            if (inputArray.get(k - 1) * inputArray.get(k) < inputArray.get(k) * inputArray.get(k + 1)) {
                max = inputArray.get(k) * inputArray.get(k + 1);
            }
        }
        System.out.println(max);
    }
}