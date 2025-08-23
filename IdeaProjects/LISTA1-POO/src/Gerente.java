/**
 * Autor: Vanessa de Freitas Ferreira
 * Data: 22/08/2025
 * Projeto: SeuProjetoAqui
 * Descrição:
 */

public class Gerente extends Funcionario {
    String departamento;

    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }
}
