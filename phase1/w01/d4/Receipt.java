package phase1.w01.d4;

import java.util.Scanner;

public class Receipt {
    public static void main(String[] args) {
        // Prompt;
        // Read the inputs in this order: quantity as an int, price as a double, item
        // name, with nextLine()
        // Then print one line formatted like this: 3 x Dates @ $4.50 = $13.50

        Scanner in = new Scanner(System.in);
        System.out.print("Lets make your Receipt!\nEnter The Quantity: ");
        int quant = in.nextInt();
        System.out.print("Enter the Price: ");
        double price = in.nextDouble();
        System.out.print("Enter the item name: ");
        in.nextLine();
        String itemName = in.next();

        double total = quant * price;
        System.out.println("Your Receipt is below");
        System.out.printf("%d x %s @ $%.2f each = $%.2f %n", quant, itemName, price, total);

        in.close();
    }
}
