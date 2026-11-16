package phase1.w01.d2;

import java.util.Scanner;

/**
 * EvenOdd
 */
public class EvenOdd {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    if (n % 2 == 0){
        System.out.println( n + "is even: " + false);
    } else {
        System.out.println( n + "is even: " + true);
    }
    
}