
/**
 * Autor: Vanessa de Freitas Ferreira
 * Data: 12/08/2025
 * Projeto: SeuProjetoAqui
 * Descrição:Ler um número inteiro N e calcular todos os seus divisores.
 */
import java.util.Scanner;

public class ex22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        int n = sc.nextInt();

        for (int i=1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);

            }
        }

        sc.close();
    }
}
