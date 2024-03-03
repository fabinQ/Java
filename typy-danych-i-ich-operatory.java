import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę całkowitą");
        int first = scanner.nextInt();
        System.out.println("Podaj drugą liczbę całkowitą");
        int secound = scanner.nextInt();

        int resume = first + secound;
        System.out.println("\n"+resume);

        resume = first-secound;
        System.out.println(resume);

        resume = first*secound;
        System.out.println(resume);

        double resume_double;
        resume_double = (double) first /secound;
        System.out.println(resume_double);
    }
}