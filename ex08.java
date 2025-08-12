import java.util.Scanner;

/**
 * Autor: Vanessa de Freitas Ferreira
 * Data: 12/08/2025
 * Projeto: SeuProjetoAqui
 * Descrição:Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
 */

public class ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um numero inteiro: ");

        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("PAR");
        }
        else {
            System.out.println("IMPAR");
        }
        sc.close();

    }


}
