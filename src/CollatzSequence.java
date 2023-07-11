import java.util.Scanner;
public class CollatzSequence
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 1) {
            System.out.println(1);
        } else {
            System.out.println(number);
            for (int iterator = 0; iterator <= number; iterator++) {
                if (number % 2 == 0) {
                    number = number / 2;
                }
                else {
                    number = (3 * number) + 1;
                }
                System.out.println(number);
            }
        }
    }
}
