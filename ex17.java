
/**
 * Autor: Vanessa de Freitas Ferreira
 * Data: 12/08/2025
 * Projeto: SeuProjetoAqui
 * Descrição: Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
 * X, se for o caso.
 */
import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("Informe o valor de x: ");
            int x = sc.nextInt();

            for (int i = 1; i <= x; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
               sc.close();
            }
    }

}
