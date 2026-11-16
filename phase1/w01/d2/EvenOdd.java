package phase1.w01.d2;

import java.util.Scanner;

/**
 * EvenOdd
 */
public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number to check if it is even or odd: ");
        int n = in.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }
        in.close();
    }
}