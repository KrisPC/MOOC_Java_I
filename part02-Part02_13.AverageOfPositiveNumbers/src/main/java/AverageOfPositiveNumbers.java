
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nums = 0;
        double numnums = 0;
        while (true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 0) {
                System.out.println("Cannot calculate the average");
                break;
            }else if (input > 0){
                nums = input + nums;
                numnums = numnums + 1;
            }else{
                continue;
            }
        }
        System.out.println(nums / numnums);
    }
}
