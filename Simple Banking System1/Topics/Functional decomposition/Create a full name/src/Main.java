import java.util.Scanner;

class Name {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next();
        String lastName = scanner.next();
        System.out.print(createFullName(firstName, lastName));
    }

    public static String createFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
}