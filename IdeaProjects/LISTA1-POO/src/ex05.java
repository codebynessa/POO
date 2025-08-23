import java.util.Scanner;

/**
 * Autor: Vanessa de Freitas Ferreira
 * Data: 21/08/2025
 * Projeto: SeuProjetoAqui
 * Descrição:○ Leia uma palavra e mostre-a invertida (ex: “java” → “avaj”),
 * utilizando for ou while.
 */

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe uma palavra: ");
        String palavra = sc.nextLine();

        String invertida = "";
        for (int i = palavra.length() - 1; i >= 0; i--) {
            invertida += palavra.charAt(i);
        }

        System.out.println("Palavra invertida: " + invertida);


        sc.close();
    }

}
