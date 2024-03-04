class Scratch {
    public static void main(String[] args) {
        int a = 2;
        int b = 10;

        System.out.println(a<b);

        String name = "Maciej";
        String name2 = "Maciej";

        System.out.println(name == name2); // nie powinniśmy tego porównywać bo optymalizator Javy sprawdza czy juz gdzieś jest Maciej

        String name3 = new String("Maciej");
        System.out.println(name == name3); // Teraz stworzyliśmy zupełnie nowy string
        System.out.println(name.equals(name3)); // Teraz porównujemy wartości

    }
}