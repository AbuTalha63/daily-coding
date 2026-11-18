package phase1.w01.d4;

public class FormattedStrings {
    
    public static void main(String[] args) {
        double avg = 87.66666666666667;
        System.out.printf("%.2f%n", avg);
        System.out.printf("%.0f%n", avg);
        System.out.printf("%d students, avg %.1f%n", 3, avg);
        System.out.printf("%s is %d%n", "Ali", 7);
        System.out.println(avg);
    }
}
