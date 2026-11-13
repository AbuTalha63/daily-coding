package phase1.w01.d1;

public class VarTypes {
    public static void main(String[] args) {
        int a = 7; 
        int b = 2;
        System.out.println(a / b); //3
        System.out.println(a % b); // 1 
        System.out.println(a / 2.0); // 3.5
        System.out.println((double) a / b); // 3.5
        System.out.println((double) (a / b)); // 3.5 X - 3.0 since parenthises run first
        System.out.println("Sum: " + a + b); //9 X - "Sum: 72" since when we do the string plus int, int becomes string, adding another int mkaes that string too

        int c = 37;
        System.out.println(c * 9 / 5 + 32); //
        System.out.println((9 / 5) * c + 32); //
    }
    
}
