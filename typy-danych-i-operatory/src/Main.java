import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę całkowitą");
        int a = scanner.nextInt();

        int b = 2;

        int c = a % b;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}