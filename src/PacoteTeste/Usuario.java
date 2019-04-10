package PacoteTeste;

public class Usuario {

    private String nome, senha, login, email;

    public Usuario() {
    }

    public Usuario(String senha, String login) {
        this.senha = senha;
        this.login = login;
    }

    public Usuario(String nome, String senha, String login, String email) {
        this.nome = nome;
        this.senha = senha;
        this.login = login;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}

