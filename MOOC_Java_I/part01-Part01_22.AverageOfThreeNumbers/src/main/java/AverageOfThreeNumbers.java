
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aveDiv = 3;
        // Write your program here
        System.out.println("Give the first number:");
        int numOne = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int numTwo = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        int numThree = Integer.valueOf(scanner.nextLine());
        System.out.println("The average is " + ((double)(numOne + numTwo + numThree)) / aveDiv);
    }
}
