
/**
 * Autor: Vanessa de Freitas Ferreira
 * Data: 12/08/2025
 * Projeto: SeuProjetoAqui
 * Descrição: Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
 * Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
 * essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
 */
import java.util.Scanner;

public class ex18 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Informe um valor: ");
            int n = sc.nextInt();

            int in = 0;
            int out = 0;

            for (int i = 0; i < n; i++) {
                System.out.println("Informe um valor: ");
                int x = sc.nextInt();
                if (x >= 10 && x <= 20) {
                    in += 1;
                } else {
                    out += 1;
                }
            }

                System.out.println(in + " in");
                System.out.println(out + " out");

                sc.close();
            }
        }





