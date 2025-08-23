import java.util.Scanner;

/**
 * Autor: Vanessa de Freitas Ferreira
 * Data: 21/08/2025
 * Projeto: SeuProjetoAqui
 * Descrição:Leia 10 números inteiros do usuário e, ao final, mostre quantos
 * deles são pares e quantos são ímpares.
 */

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pares = 0;
        int impares = 0;

        for (int i = 1; i <= 10; i++){
            System.out.print("Digite o " + i + "° numero: ");
            int num = sc.nextInt();

            if (num % 2 == 0) {
                pares++;
            }
            else {
                impares++;
            }
        }

        System.out.println("pares: " + pares);
        System.out.println("impares: " + impares);





        sc.close();
    }

}
