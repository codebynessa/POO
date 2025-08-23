/**
 * Autor: Vanessa de Freitas Ferreira
 * Data: 22/08/2025
 * Projeto: SeuProjetoAqui
 * Descrição: ○ Crie uma classe Pessoa com os atributos nome e idade.
 * ○ Instancie dois objetos no método main, atribua valores e exiba-os
 * no console.
 */

public class Pessoa {
    private String nome;
    private int idade;

    //○ Torne os atributos nome e idade privados.
    //○ Implemente métodos acessores (getters e setters).
    //○ Crie objetos no main e altere valores via set.

    public Pessoa() {}

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    }
