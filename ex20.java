
/**
 * Autor: Vanessa de Freitas Ferreira
 * Data: 12/08/2025
 * Projeto: SeuProjetoAqui
 * Descrição: Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
 * segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
 */
import java.util.Locale;
import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o numero de testes: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Informe o primeiro numero: ");
            double n1 = sc.nextDouble();
            System.out.println("Informe o segundo numero: ");
            double n2 = sc.nextDouble();

            if (n2 == 0) {
                System.out.println("divisao impossivel");

            }
            else {
                double media = n1 / n2;
                System.out.println(media);


            }
        }


        sc.close();
    }

}
