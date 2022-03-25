import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sizeOfArray = sc.nextInt();
        int[] inputArray = new int[sizeOfArray];

        for (int i = 0; i < sizeOfArray; i++) {
            inputArray[i] = sc.nextInt();
        }

        int sum = 0;

        for (int num : inputArray) {
            sum += num;
        }

        System.out.println(sum);
    }
}