
/**
 * Autor: Vanessa de Freitas Ferreira
 * Data: 12/08/2025
 * Projeto: SeuProjetoAqui
 * Descrição:Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
 * cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
 * menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
 * 1º Quadrante: x > 0 e y > 0 (ambos positivos)
 * 2º Quadrante: x < 0 e y > 0 (x negativo e y positivo)
 * 3º Quadrante: x < 0 e y < 0 (ambos negativos)
 * 4º Quadrante: x > 0 e y < 0 (x positivo e y negativo)
 */
import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor de x: ");
        int x = sc.nextInt();
        System.out.println("Informe o valor de y: ");
        int y = sc.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            }
            else if (x < 0 && y > 0) {
                System.out.println("segundo");

            }
            else if (x < 0 && y < 0) {
                System.out.println("terceiro");

            }
            else {
                System.out.println("quarto");

            }
            System.out.println("Informe o valor de x: ");
             x = sc.nextInt();
            System.out.println("Informe o valor de y: ");
             y = sc.nextInt();

        }
        sc.close();

    }

}
