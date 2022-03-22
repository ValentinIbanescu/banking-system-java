import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> input = new ArrayList<>();

        while (sc.hasNext()) {
            input.add(sc.next());
        }

        boolean result = true;

        for (int k = 1; k < input.size(); k++) {
            if (input.get(k).compareTo(input.get(k - 1)) >= 0) {
                result = true;
            } else {
                result = false;
            }
        }
        System.out.print(result);
    }
}