
/**
 * Autor: Vanessa de Freitas Ferreira
 * Data: 12/08/2025
 * Projeto: SeuProjetoAqui
 * Descrição:Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
 * seguir, calcule e mostre o valor da conta a pagar.
 */
import java.util.Locale;
import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.printf("%n1:cachorro quente %n2:x-salada %n3:x-bacon %n4:torrada simples %n5:refrigerante %ndigite o codigo: ");
        int codigo = sc.nextInt();
        System.out.println("Informe a quantidade: ");
        int quantidade = sc.nextInt();

        if (codigo == 1) {
            double total = 4.0 * quantidade;
            System.out.printf("Total: R$ %.2f", total);
        }
        else if (codigo == 2) {
            double total = 4.50 * quantidade;
            System.out.printf("Total: R$ %.2f", total);

        }
        else if (codigo == 3) {
            double total = 5.0 * quantidade;
            System.out.printf("Total: R$ %.2f", total);

        }
        else if (codigo == 4) {
            double total = 2.0 * quantidade;
            System.out.printf("Total: R$ %.2f", total);

        }
        else {
            double total = 1.50 * quantidade;
            System.out.printf("Total: R$ %.2f", total);
        }
        sc.close();
    }

}
