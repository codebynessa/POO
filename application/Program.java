

/**
 * Autor: Vanessa de Freitas Ferreira
 * Data: 14/08/2025
 * Projeto: SeuProjetoAqui
 * Descrição:
 */
package application;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Rectangle rect = new Rectangle();

        System.out.println("Enter rectangle width: ");
        rect.width = sc.nextDouble();
        System.out.println("Enter rectangle height: ");
        rect.height = sc.nextDouble();

        System.out.printf("AREA = %.2f %nPERIMETER = %.2f %nDIAGONAL = %.2f", rect.area(), rect.perimeter(), rect.perimeter());

        sc.close();
    }

}
