import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

class Scratch {
    public static void main(String[] args) {
        double a = 2.0;
        double b = 1.5;

        double c = a/b;

        System.out.println(Math.round(c*100)/100.0);

        BigDecimal roundedNumber = new BigDecimal(c).setScale(2, RoundingMode.HALF_UP);
        System.out.println(roundedNumber.doubleValue());

        DecimalFormat decimalFormat = new DecimalFormat("###.##");
        System.out.println(decimalFormat.format(c));

        String formattedNumber = String.format("%.2f", c);
        System.out.println(formattedNumber);

        System.out.println(Math.ceil(c)); //zaokrąglenie w górę ceil - sufit - zwraca double
        System.out.println(Math.floor(c)); //zaokrąglenie w dół - zwraca double
        System.out.println(Math.round(c)); // zwraca int

    }
}