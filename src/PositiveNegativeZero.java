import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String s[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = scanner.nextInt();
        scanner.nextLine();
        checkNumber(number);
    }
    private static void checkNumber(int num){
        if (num > 0) {
            System.out.println("postive");
        } else if (num < 0) {
            System.out.println("Negative");
        } else if (num == 0) {
            System.out.println("Zero");
        }

    }
}
