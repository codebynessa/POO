
/**
 * Autor: Vanessa de Freitas Ferreira
 * Data: 12/08/2025
 * Projeto: SeuProjetoAqui
 * Descrição: Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
 * de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
 * conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
 * peso 5.
 */

import java.util.Locale;
import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o numero de testes: ");
        int testes = sc.nextInt();


        for (int i=0; i < testes; i++) {
            System.out.println("informe a nota 1: ");
            double n1 = sc.nextDouble();
            System.out.println("informe a nota 2: ");
            double n2 = sc.nextDouble();
            System.out.println("informe a nota 3: ");
            double n3 = sc.nextDouble();

            double media = (n1 * 2.0 + n2 * 3.0 + n3 * 5.0) / 10.0;

            System.out.printf("%.1f%n", media);


        }


        sc.close();

    }


}
