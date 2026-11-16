package phase1.w01.d3;

import java.util.Scanner;

/**
 * Initials
 */
public class Initials {
    public static void main(String[] args) {
        // String s = "Bismillah";
        // System.out.println(s.charAt(8));

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String fName = in.next();
        
        System.out.print("Enter your last name: ");
        String lName = in.next();

        char fInitial = fName.charAt((fName.length() - 1) - (fName.length() - 1));
        System.out.println(fInitial);

        char L_Initial = lName.charAt((lName.length() - 1) - (lName.length() - 1));
        System.out.println(L_Initial);

        System.out.println("Your Initials are: " + fInitial + "." + L_Initial + ".");

        in.close();
    }
    
}