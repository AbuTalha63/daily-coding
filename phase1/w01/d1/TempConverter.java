package phase1.w01.d1;

public class TempConverter {
    public static void main(String[] args) {
        int c = 37;

        System.out.println(c * 9 / 5 + 32); // 98 cause c is an int so the result becomes int too, then +32 stays int
        System.out.println(9 / 5 * c + 32); // 69 cause only full value of 9 / 5 is 1. decimals don't carry over
        
        //fix of above
        System.out.println((double)(9 / 5) * c + 32);
    }
}