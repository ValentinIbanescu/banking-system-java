import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numOfElem = sc.nextInt();
        int[] numArray = new int[numOfElem];

        for (int i = 0; i < numOfElem; i++) {
            numArray[i] = sc.nextInt();
        }

        int firstMax = 0;
        int index = 0;

        for (int k = 0; k < numOfElem; k++) {
            if (numArray[k] > firstMax) {
                firstMax = numArray[k];
                index = k;
            }
        }
        System.out.println(index);
    }
}