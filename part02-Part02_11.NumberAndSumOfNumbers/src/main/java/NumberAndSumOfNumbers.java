
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nums = 0;
        int numnums = 0;
        while (true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 0) {
                break;
            } else {
                nums = input + nums;
                numnums = numnums + 1;
            }
        }
        System.out.println("Sum of the numbers: " + nums);
        System.out.println("Number of: " + nums);
    }
}
