import java.util.Scanner;

/**
 * Autor: Vanessa de Freitas Ferreira
 * Data: 21/08/2025
 * Projeto: SeuProjetoAqui
 * Descrição:Crie um programa que leia vários números inteiros até que o
 * usuário digite 0.
 * ○ Ao final, mostre a soma de todos os números digitados
 */

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        int num = 0;

        do {
            System.out.print("Informe um numero (digite 0 pra sair): ");
            num = sc.nextInt();
            soma += num;
        }
        while (num != 0);
        System.out.println("Soma: " + soma);

        sc.close();
    }

}
