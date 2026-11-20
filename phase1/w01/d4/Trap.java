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
        // in.nextLine(); <---- One fix for this : aka adding a nextLine to take in the \n sitting in the buffer
        // nextInt() stops BEFORE the Enter key's \n, leaving it in the buffer.
        // Without this line, the next nextLine() hits that \n immediately
        // and returns "" instead of waiting for the user.

        //Basically: This bug will come about when you have a nextLine() after a nextInt() or nextDouble()
        System.out.print("Name & age: ");
        String name = in.nextLine();
        System.out.println("[" + name + "], age: " + age);

        in.close();
    }
}