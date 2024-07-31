
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Days = 24 hours
        //1 hour = 60 minutes
        //1 minute = 60 seconds
        
        System.out.println("How many days would you like to convert to seconds?");
        int number = Integer.valueOf(scanner.nextLine());
        System.out.println(number * 60 * 60 * 24);
        // Write your program here

    }
}
