import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("SALAM DUNYA!");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        int ilkEded = scanner.nextInt();

        System.out.print("Enter your second number: ");
        int ikinciEded = scanner.nextInt();

        System.out.println(2 + 2);
        System.out.println(ilkEded + ikinciEded);
    }
}
