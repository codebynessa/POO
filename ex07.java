
/**
 * Autor: Vanessa de Freitas Ferreira
 * Data: 11/08/2025
 * Projeto: SeuProjetoAqui
 * Descrição:Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
 */
import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Informe um numero: ");
        n = sc.nextInt();

        if (n < 0) {
            System.out.println("NEGATIVO");
        }
        else {
            System.out.println("NAO NEGATIVO");
        }


    sc.close();
    }

}
