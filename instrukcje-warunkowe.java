import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ile masz lat?");
//        int age = scanner.nextInt();
//        if (age>=18){
//            System.out.println("Jesteś pełnoletni_a");
//        }
//        else {
//            System.out.println("Nie jesteś pełnoletni_a");
//        }
        System.out.println("Jakie jest światło? (zielone, żółte, czerwone)");
        String light = scanner.nextLine().toLowerCase();

        if (light.equals("zielone")){
            System.out.println("Jedź!");
        } else if (light.equals("żółte")) {
            System.out.println("Czekaj!");
        }
        else if (light.equals("czerwone")){
            light.equals("czerwone");
            System.out.println("STOP!");
        }
        else {
            System.out.println("Sprawdź kolor jeszcze raz!");
        }
    }
}