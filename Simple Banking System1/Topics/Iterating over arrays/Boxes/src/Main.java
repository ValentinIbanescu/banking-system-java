import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int size = 3;

        int[] box1 = getArray(sc);
        int[] box2 = getArray(sc);

        String answer = "";

        for (int j = 0; j < size; j++) {

            if (box1[j] < box2[j]) {
                answer = "Box 1 < Box 2";
            } else if (box1[j] > box2[j]) {
                answer = "Box 1 > Box 2";
            } else {
                answer = "Incompatible";
                break;
            }
        }
        System.out.println(answer);
    }

    public static int[] getArray(Scanner sc) {
        final int sides = 3;

        int[] box = new int[sides];

        for (int i = 0; i < sides; i++) {
            box[i] = sc.nextInt();
        }
        Arrays.sort(box);
        return box;
    }
}
