import java.util.Locale;

class teste {
    public static void main(String[] args) {

        double y = 20.5258;
        System.out.println(y);

        System.out.printf("%.2f%n", y);
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n", y);

    }

}



