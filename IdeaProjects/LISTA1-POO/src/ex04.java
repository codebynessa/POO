
/**
 * Autor: Vanessa de Freitas Ferreira
 * Data: 21/08/2025
 * Projeto: SeuProjetoAqui
 * Descrição:Escreva um programa que leia um número inteiro e verifique se ele
 * é primo.
 * ○ Caso não seja, mostre seus divisores.
 */
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um numero: ");
        int num = sc.nextInt();
        boolean primo = true;

        if (num <= 1) {
            primo = false;
        }
        else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }
        }
        if (primo) {
            System.out.println(num + " é primo");

        }
        else {
            System.out.println(num + " nao é primo");
            System.out.println("Divisores: ");
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    System.out.print(i + " ");

                }
            }
        }
    }

}
