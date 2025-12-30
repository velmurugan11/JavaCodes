
import java.util.Scanner;

public class LargestOfTwo{
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the 1st number:");
        int first = s.nextInt();
        System.out.println("Enter the 2nd number:");
        int second = s.nextInt();

        int largest = (second > first) ? second : first;
        System.out.println("Processing!");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Largest Number "+ largest);


    }
}