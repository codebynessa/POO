/**
 * Autor: Vanessa de Freitas Ferreira
 * Data: 11/08/2025
 * Projeto: SeuProjetoAqui
 * Descrição:Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
 * mensagem explicativa, conforme exemplos.
 */
import java.util.Scanner;
public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero:");
        int num1;
        num1 = sc.nextInt();
        System.out.println("Digite o segundo numero:");
        int num2;
        num2 = sc.nextInt();

        int soma = num1 + num2;
        System.out.printf("SOMA = %d", soma);
    }
}