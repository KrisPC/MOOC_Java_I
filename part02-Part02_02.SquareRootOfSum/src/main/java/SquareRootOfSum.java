
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int square1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a second number:");
        int square2 = Integer.valueOf(scanner.nextLine());
        System.out.println("Square root of the sum of the numbers you gave: " + (Math.sqrt(square1 + square2)));
    }
}
