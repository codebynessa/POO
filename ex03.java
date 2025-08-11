/**
 * Autor: Vanessa de Freitas Ferreira
 * Data: 11/08/2025
 * Projeto: SeuProjetoAqui
 * Descrição:Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
 * de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
 */
import java.util.Scanner;
public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor de A: ");
        int A, B, C, D;
        A = sc.nextInt();
        System.out.println("Informe o valor de B: ");
        B = sc.nextInt();
        System.out.println("Informe o valor de C: ");
        C = sc.nextInt();
        System.out.println("Informe o valor de D: ");
        D = sc.nextInt();

        int diferenca = (A*B - C * D);
        System.out.printf("DIFERENCA = %d", diferenca);





    }
}