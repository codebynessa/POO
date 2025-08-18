package entities;

/**
 * Autor: Vanessa de Freitas Ferreira
 * Data: 18/08/2025
 * Projeto: SeuProjetoAqui
 * Descrição:
 */

public class CurrencyConverter {

    public static double IOF = 0.06;

    public static double dollarToReal(double amount, double dollarPrice) {
        return amount * dollarPrice * (1.0 + IOF);
    }

}
