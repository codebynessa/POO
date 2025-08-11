
/**
 * Autor: Vanessa de Freitas Ferreira
 * Data: 11/08/2025
 * Projeto:
 * Descrição: Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
 * código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
 */
import java.util.Locale;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("PEÇA 1");
        System.out.print("Informe o codigo da peça 1: ");
        int cod1;
        cod1 = sc.nextInt();
        System.out.print("Informe o numero de peças 1: ");
        int num1;
        num1 = sc.nextInt();
        System.out.print("Informe o valor unitario de cada peça 1: ");
        double valor1;
        valor1 = sc.nextDouble();

        System.out.println("PEÇA 2");
        System.out.print("Informe o codigo da peça 2: ");
        int cod2;
        cod2 = sc.nextInt();
        System.out.print("Informe o numero de peças 2: ");
        int num2;
        num2 = sc.nextInt();
        System.out.print("Informe o valor unitario de cada peça 2: ");
        double valor2;
        valor2= sc.nextDouble();

        double total = (num1 * valor1) + (num2 * valor2);

        System.out.printf("%nVALOR A PAGAR: R$ %.2f", total);
    }
}
