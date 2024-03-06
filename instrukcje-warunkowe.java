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


//        System.out.println("Jakie jest światło? (zielone, żółte, czerwone)");
//        String light = scanner.nextLine().toLowerCase();
//
//        if (light.equals("zielone")){
//            System.out.println("Jedź!");
//        } else if (light.equals("żółte")) {
//            System.out.println("Czekaj!");
//        }
//        else if (light.equals("czerwone")){
//            light.equals("czerwone");
//            System.out.println("STOP!");
//        }
//        else {
//            System.out.println("Sprawdź kolor jeszcze raz!");
//        }



        System.out.println("Jaki jest Twój wynik %(0 - 100)?");
        int score = scanner.nextInt();

        if (score<0 || score>100){
            System.out.println("Niepoprawne dane!");
            System.exit(0);
        }
        else {
            if (score>=90){
                System.out.println("Brawo! Twoja ocena to 5!");
            }
            else if (score>=80) {
                System.out.println("Twoja ocena to 4.");
            }
            else if (score>=70) {
                System.out.println("Twoja ocena to 3.");
            }
            else if (score>=60) {
                System.out.println("Twoja ocena to 2.");
            }
            else {
                System.out.println("Twoja ocena to 1.");
            }
        }

    }
}