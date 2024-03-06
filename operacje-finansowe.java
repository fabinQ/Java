import java.math.BigDecimal;

class Scratch {
    public static void main(String[] args) {
        double a = 2.55;
        double b = 2.45;

        System.out.println(a-b);

        BigDecimal c = new BigDecimal("0.1");
        BigDecimal d = new BigDecimal("0.2");

        System.out.println(c.add(d));

    }
}