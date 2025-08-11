/**
 * Autor: Vanessa de Freitas Ferreira
 * Data: 11/08/2025
 * Projeto: SeuProjetoAqui
 * Descrição:Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
 * hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
 * decimais.
 */

import java.util.Locale;
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o numero do funcionario: ");
        int numero;
        numero = sc.nextInt();

        System.out.println("Informe o numero de horas trabalhadas: ");
        int horas;
        horas = sc.nextInt();

        System.out.println("Informe o valor recebido por hora: ");
        double valor;
        valor = sc.nextDouble();

        double salario = valor * horas;

        System.out.printf("NUMBER = %d %nSALARY = U$ %.2f", numero, salario);
    }

}
