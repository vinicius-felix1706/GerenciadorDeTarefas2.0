package dev.vinicius.gerenciadorDeTarefas.Entities;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_usuarios")
public class Usuário {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long id;
    private String nome;
    private String email;
    private int idade;
    private String senha;


    public Usuário() {
    }

    public Usuário(String nome, String email, int idade, Long id, String senha) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.id = id;
        this.senha = senha;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}


