import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int rotations = sc.nextInt();

        // Reverse the input array;
        String[] inputArray = reverse(input.split(" "));

        // Number of rotations is the reminder;
        int reminderRotations = rotations % inputArray.length;

        // Split the reversed array in two parts;
        String[] partOne = Arrays.copyOfRange(inputArray, 0, reminderRotations);
        String[] partTwo = Arrays.copyOfRange(inputArray, reminderRotations, inputArray.length);

        // Reverse the 2 parts back and merge;
        String[] rotatedArray = merge(reverse(partOne), reverse(partTwo));

        // Print the resulted array;
        for (String elem : rotatedArray) {
            System.out.print(elem + " ");
        }
    }

    public static String[] merge(String[] a, String[] b) {
        int aLength = a.length;
        int bLength = b.length;
        int mergedLength = aLength + bLength;
        String[] mergedArray = new String[mergedLength];
        int pos = 0;

        for (String elem : a) {
            mergedArray[pos] = elem;
            pos++;
        }

        for (String elem : b) {
            mergedArray[pos] = elem;
            pos++;
        }
        return mergedArray;
    }

    public static String[] reverse(String[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }
}