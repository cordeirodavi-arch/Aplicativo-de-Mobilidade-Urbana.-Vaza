package Projeto_Java;

public abstract class Usuario {
    private final int id;
    private String nome;
    private String email;
    private String senha;
    private String telefone;

    protected Usuario(int id, String nome, String email, String senha, String telefone) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
    }

    public boolean fazerLogin(String email, String senha) {
        return this.email.equals(email) && this.senha.equals(senha);
    }

    public void atualizarPerfil(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }
}