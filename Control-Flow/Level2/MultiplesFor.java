import java.util.Scanner;

public class MultiplesFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (less than 100): ");
        int number = sc.nextInt();

        if (number > 0 && number < 100) {
            for (int i = number; i < 100; i += number) {
                System.out.println(i);
            }
        } else {
            System.out.println("Please enter a positive number less than 100.");
        }
    }
}
