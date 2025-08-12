
/**
 * Autor: Vanessa de Freitas Ferreira
 * Data: 12/08/2025
 * Projeto: SeuProjetoAqui
 * Descrição:Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
 * Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
 * ordem crescente ou decrescente.
 */
import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor de A: ");
        int a = sc.nextInt();
        System.out.println("Informe o valor de B: ");
        int b = sc.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("Sao multiplos");
        }
        else {
            System.out.println("Nao sao multiplos");
        }
        sc.close();

    }

}
