/**
 * Autor: Vanessa de Freitas Ferreira
 * Data: 22/08/2025
 * Projeto: SeuProjetoAqui
 * Descrição:
 */
public class ContaBancaria {
    String titular;
    double saldo;

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("saldo insuficiente!");
        }
    }

    public void mostrarSaldo() {
        System.out.println("saldo atual: R$ " + saldo);
    }
}
