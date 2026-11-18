package phase1.w01.d4;
import java.util.Scanner;

public class ScoreAverage {
    public static void main(String[] args) {
        // Prompt;
        // Read three int scores from the keyboard, with a prompt for each.
        // Print the average with exactly 2 decimals, like Average: 87.67.
        Scanner in = new Scanner(System.in);

        System.out.print("lets calculate the average!\nSend the first number: ");
        int num1 = in.nextInt();
        System.out.print("Send the second number: ");
        int num2 = in.nextInt();
        System.out.print("Send the third number: ");
        int num3 = in.nextInt();
        double avg = (double)(num1 + num2 + num3) / 3;

        System.out.printf("%d and %d and %d average out to: %.2f!%n", num1, num2, num3, avg);
        in.close();
    }

}
