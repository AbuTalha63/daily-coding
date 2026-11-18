package phase1.w01.d4;

import java.util.Scanner;

/**
 * Trap
 */
public class Trap {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Age: ");
        int age = in.nextInt();
        // in.nextLine();
        // nextInt() stops BEFORE the Enter key's \n, leaving it in the buffer.
        // Without this line, the next nextLine() hits that \n immediately
        // and returns "" instead of waiting for the user.
        System.out.print("Name: ");
        String name = in.nextLine();
        System.out.println("[" + name + "]");

        in.close();
    }
}