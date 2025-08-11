import java.util.Locale;

/**
 * Autor: Vanessa de Freitas Ferreira
 * Data: 11/08/2025
 * Projeto:
 * Descrição:
 */

public class ex1 {
    public static void main(String[] args) {
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf("Products:%nComputer, which price is $ %.2f %nOffice desk, which price is $ %.2f%n", price1, price2);
        System.out.printf("%nRecord: %d years old, code %d and gender: %s%n", age, code, gender);
        System.out.printf("%nMeasure with eight decimal places: %.8f %n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f ", measure);



    }
    }



