import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        int[] inputArray = readArray();
        int longest = 1;
        int counter = 1;

        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i - 1] < inputArray[i]) {
                counter++;
                longest = counter;
            } else {
                if (counter > longest) {
                    longest = counter;
                }
                counter = 1;
            }
        }

        System.out.println(longest);

    }

    public static int[] readArray() {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arrayOfInts = new int[size];
        for (int i = 0; i < size; i++) {
            int elem = sc.nextInt();
            arrayOfInts[i] = elem;
        }

        return arrayOfInts;
    }
}