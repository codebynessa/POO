/**
 * Autor: Vanessa de Freitas Ferreira
 * Data: 22/08/2025
 * Projeto: SeuProjetoAqui
 * Descrição:
 */

public class Usuario implements Autenticavel {
    private String nome;
    private String senha;

    // construtor
    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    // implementação do método da interface
    @Override
    public boolean login(String usuario, String senha) {
        return this.nome.equals(usuario) && this.senha.equals(senha);
    }

    // getter só para exibir depois
    public String getNome() {
        return nome;
    }
}
