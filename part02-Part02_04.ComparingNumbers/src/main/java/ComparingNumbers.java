
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int square1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a second number:");
        int square2 = Integer.valueOf(scanner.nextLine());
        
        if(square1 > square2){
            System.out.println(square1 + " is greater than " + square2);
        }else if(square1 < square2){
            System.out.println(square1 + " is smaller than " + square2);
        }else{
            System.out.println(square1 + " is equal to " + square2);
        }
    }
}
