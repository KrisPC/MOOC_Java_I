
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        System.out.println("Give a string:");
        String stringVal = String.valueOf(scanner.nextLine());
        System.out.println("Give an integer:");
        int intVal = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a double:");
        double doubleVal = Double.valueOf(scanner.nextLine());
        System.out.println("Give a boolean:");
        boolean boolVal = Boolean.valueOf(scanner.nextLine());
        System.out.println("You gave the string " + stringVal);
        System.out.println("You gave the integer " + intVal);
        System.out.println("You gave the double " + doubleVal);
        System.out.println("You gave the boolean " + boolVal);
        
    }
}
