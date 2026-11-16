package phase1.w01.d3;

import java.util.Scanner;

public class NameCard {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);        
        System.out.print("Please type in your full name: ");

        String fullName = in.nextLine();

        String fullNameUpper = fullName.toUpperCase();
        int nameLength = fullName.length();
        String first3 = fullName.substring(0, 3);

        System.out.println("Your name is: " + fullName);
        System.out.println("In Upper Case: " + fullNameUpper);
        System.out.println("Which is: " + nameLength + " characters long!");
        System.out.println("First 3 letters: " + first3);

        in.close();
    }
}
