import java.util.Scanner;

/**
 * Autor: Vanessa de Freitas Ferreira
 * Data: 21/08/2025
 * Projeto: SeuProjetoAqui
 * Descrição:Escreva um programa que leia um número inteiro e imprima a
 * tabuada desse número de 1 até 10 usando um laço for.
 */

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um numero: "); //cria um objeto q lê o q a pessoa digita
        int num = sc.nextInt();

        System.out.println("Tabuada de " + num + ":");
        for (int i = 1; i <= 10; i++) {
            int tab = num * i;
            System.out.println(num + "x" + i + "=" + tab);
        }

        sc.close(); //fechar o scanner
    }

}
